import java.util.Scanner;

public class exr3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Sort Alphabetically");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original and Reversed");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter a string:");
                    inputString = scanner.nextLine();
                    if (isPalindrome(inputString)) {
                        System.out.println(inputString + " is a palindrome.");
                    } else {
                        System.out.println(inputString + " is not a palindrome.");
                    }
                    break;
                case 2:
                    System.out.println("Enter a string:");
                    inputString = scanner.nextLine();
                    System.out.println("String in alphabetical order: " + sortString(inputString));
                    break;
                case 3:
                    System.out.println("Enter a string:");
                    inputString = scanner.nextLine();
                    System.out.println("Reversed string: " + reverseString(inputString));
                    break;
                case 4:
                    System.out.println("Enter a string:");
                    inputString = scanner.nextLine();
                    System.out.println("Concatenated string: " + concatenate(inputString, reverseString(inputString)));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        // Bubble sort to avoid Arrays.sort
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}