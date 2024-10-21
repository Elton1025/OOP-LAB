import java.util.Scanner;

public class exr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the word to replace repeating characters:");
        String replacementWord = scanner.nextLine();

        String resultString = inputString.replaceAll("(.)\\1+", replacementWord);

        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + resultString);
    }
}