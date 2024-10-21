import java.util.Scanner;

public class exr4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1, string2;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Compare Strings");
            System.out.println("2. Convert Case");
            System.out.println("3. Check Substring");
            System.out.println("4. Replace Substring");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the first string:");
                    string1 = scanner.nextLine();
                    System.out.println("Enter the second string:");
                    string2 = scanner.nextLine();
                    compareStrings(string1, string2);
                    break;
                case 2:
                    System.out.println("Enter a string:");
                    string1 = scanner.nextLine();
                    System.out.println("Converted string: " + convertCase(string1));
                    break;
                case 3:
                    System.out.println("Enter the main string:");
                    string1 = scanner.nextLine();
                    System.out.println("Enter the potential substring:");
                    string2 = scanner.nextLine();
                    checkSubstring(string1, string2);
                    break;
                case 4:
                    System.out.println("Enter the main string:");
                    string1 = scanner.nextLine();
                    System.out.println("Enter the substring to replace:");
                    string2 = scanner.nextLine();
                    replaceSubstring(string1, string2);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void compareStrings(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else {
            System.out.println(str2 + " comes before " + str1 + " lexicographically.");
        }
    }

    public static String convertCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void checkSubstring(String mainString, String subString) {
        if (mainString.contains(subString)) {
            System.out.println(subString + " is a substring of " + mainString);
        } else {
            System.out.println(subString + " is not a substring of " + mainString);
        }
    }

    public static void replaceSubstring(String mainString, String subString) {
        if (mainString.contains(subString)) {
            String replacedString = mainString.replace(subString, "Hello");
            System.out.println("Modified string: " + replacedString);
        } else {
            System.out.println(subString + " is not a substring of " + mainString);
        }
    }
}