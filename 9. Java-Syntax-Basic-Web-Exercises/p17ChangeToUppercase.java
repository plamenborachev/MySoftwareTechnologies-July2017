import java.util.Scanner;

public class p17ChangeToUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        while (inputText.contains("<upcase>")) {

            String start = "<upcase>";
            String end = "</upcase>";

            int beginIndex = inputText.indexOf(start) + start.length();
            int endIndex = inputText.indexOf(end);

            String toBeReplaced = inputText.substring(beginIndex, endIndex);
            String replacingString = toBeReplaced.toUpperCase();

            inputText = inputText.replace(toBeReplaced, replacingString);
            inputText = inputText.replaceFirst(start, "");
            inputText = inputText.replaceFirst(end, "");
        }

        System.out.println(inputText);
    }
}
