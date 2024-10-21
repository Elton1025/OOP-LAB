import java.util.Scanner;

public class exr1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        int vowelCount = 0;

        characterCount = inputString.length();

        String[] words = inputString.split("\\s+");
        wordCount = words.length;

        String[] lines = inputString.split("\r\n|\r|\n");
        lineCount = lines.length;

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}