package p25BookLibraryModification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookLibrary library = new BookLibrary(){{
            setName("Prosveta");
            setBooks(new ArrayList<>());
        }};

        int booksCount = Integer.parseInt(scanner.nextLine());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i = 0; i < booksCount; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            Book book = new Book(){{
                setTitle(tokens[0]);
                setAuthor(tokens[1]);
                setPublisher(tokens[2]);
                setReleaseDate(LocalDate.parse(tokens[3], df));
                setIsbn(tokens[4]);
                setPrice(Double.parseDouble(tokens[05]));
            }};

            library.getBooks().add(book);
        }

        LocalDate minReleaseDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Book[] sortedBooks = library.getBooks()
                .stream()
                .filter(a -> a.getReleaseDate().isAfter(minReleaseDate))
                .sorted((a, b) -> {
                    int comparissonResult = a.getReleaseDate().compareTo(b.getReleaseDate());

                    if (comparissonResult == 0){
                        comparissonResult = a.getTitle().compareTo(b.getTitle());
                    }

                    return comparissonResult;
                })
                .toArray(Book[]::new);

        for (Book book : sortedBooks) {
            System.out.printf("%s -> %s%n", book.getTitle(), df.format(book.getReleaseDate()));
        }
    }
}
