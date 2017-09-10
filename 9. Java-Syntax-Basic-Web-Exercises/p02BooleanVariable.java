import java.util.Scanner;

public class p02BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Boolean boolean1 = Boolean.valueOf(input);

        if (boolean1 == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
