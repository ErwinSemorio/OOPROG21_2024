import java.util.Scanner;

public class SpoonerismGenerator {

    // Method to get a word input from the user
    private static String getWord(String wordNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + wordNumber + ": ");
        return scanner.nextLine().trim().toLowerCase();  
    }

    // Method to find the index of the first vowel in a word
    private static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                return i;  
            }
        }
        return -1;  // No vowel found
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    // Method to run the program and manage spoonerism logic
    public static void run() {
        String word1 = getWord("first word");
        String word2 = getWord("second word");

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        // Extract parts of the words
        String start1 = word1.substring(0, vowelIndex1);
        String rest1 = word1.substring(vowelIndex1);
        String start2 = word2.substring(0, vowelIndex2);
        String rest2 = word2.substring(vowelIndex2);

        // Create the spoonerized words
        String spoonerized1 = start2 + rest1;
        String spoonerized2 = start1 + rest2;

        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized1 + " " + spoonerized2);
    }

    public static void main(String[] args) {
        run();  // Start the program
    }
}
