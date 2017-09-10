import java.util.Scanner;

public class p01VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberInHexadecimalFormat = scanner.nextLine();
        int numberInDecimalFormat = Integer.parseInt(numberInHexadecimalFormat, 16);

        System.out.println(numberInDecimalFormat);
    }
}
