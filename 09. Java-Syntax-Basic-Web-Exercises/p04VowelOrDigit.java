import java.util.Scanner;

public class p04VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.nextLine().charAt(0);

        if (Character.isDigit(inputChar)) {
            System.out.println("digit");
        } else if ("AEIOUaeiou".indexOf(inputChar) != -1) {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
