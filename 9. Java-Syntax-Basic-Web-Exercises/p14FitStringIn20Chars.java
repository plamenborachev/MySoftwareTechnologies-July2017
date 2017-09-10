import java.util.Scanner;

public class p14FitStringIn20Chars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (input.length() <= 20) {
            StringBuilder sb = new StringBuilder();

            sb.append(input);

            for (int i = input.length() + 1; i <= 20; i++) {
                sb.append("*");
            }

            System.out.println(sb);
        } else {
            System.out.println(input.substring(0, 20));
        }
    }
}
