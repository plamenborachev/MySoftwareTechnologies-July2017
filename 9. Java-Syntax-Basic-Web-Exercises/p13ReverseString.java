import java.util.Scanner;

public class p13ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(input.length() - 1 - i));
        }

        System.out.println(sb);
    }
}
