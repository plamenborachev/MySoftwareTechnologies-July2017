import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p12BombNumbers {
    public  static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> sequence = new ArrayList<>(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            sequence.add(numbers[i]);
        }

        String[] input = scan.nextLine().split(" ");

        int number = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        for (int i = 0; i < sequence.size(); i++)
        {
            if (sequence.get(i) == number)
            {
                int left = Math.max(i - power, 0);

                int right = Math.min(i + power, sequence.size() - 1);

                int lenght = right - left + 1;

                for (int j = left + lenght - 1; j >= left; j--) {
                    sequence.remove(j);
                }

                i = 0;
            }
        }

        int sum = 0;

        for (int i = 0; i < sequence.size(); i++) {
            sum += sequence.get(i);
        }
        System.out.println(sum);
    }
}
