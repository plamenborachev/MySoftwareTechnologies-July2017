import java.util.Scanner;

public class p05IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println(hexadecimalNumber.toUpperCase());
        System.out.println(binaryNumber);
    }
}
