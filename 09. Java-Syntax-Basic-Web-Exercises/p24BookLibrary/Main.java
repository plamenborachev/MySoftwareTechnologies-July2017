package p24BookLibrary;

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

        library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int comparissonResult = Double.compare(b.getValue(), a.getValue());

                    if (comparissonResult == 0){
                        comparissonResult = a.getKey().compareTo(b.getKey());
                    }

                    return comparissonResult;
                })
                .forEach((kvp) -> {
                    String author = kvp.getKey();
                    double totalSum = kvp.getValue();
                    System.out.printf("%s -> %.2f%n", author, totalSum);
                });
    }
}
