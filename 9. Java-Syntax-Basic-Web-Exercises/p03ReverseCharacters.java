import java.util.Scanner;

public class p03ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        char[] threeChars = {firstChar, secondChar, thirdChar};

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i >= 0 ; i--) {
            sb.append(threeChars[i]);
        }

        System.out.println(sb);
    }
}
