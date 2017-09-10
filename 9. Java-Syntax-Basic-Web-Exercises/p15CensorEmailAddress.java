import java.util.Scanner;

public class p15CensorEmailAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String replace = scan.nextLine();
        String[] b = replace.split("@");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b[0].length(); i++) {
            sb.append("*");
        }

        String replacement = sb + "@" + b[1];
        String c = scan.nextLine();
        System.out.println(c.replace(replace, replacement));
    }
}
