import java.util.*;
 class _49AscendingWords {
 
    public static void main(String args[]) {
        // Accept input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        // Add a space at end of input String
        input = input + " ";
        // Find number of words
        int numberOfWords = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                numberOfWords++;
            }
        }
        // Extract words and store in array
        String[] words = new String[numberOfWords];
        int startIndex = 0;
        int currentWord = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                String word = input.substring(startIndex, i);
                words[currentWord] = word;
                currentWord++;
                startIndex = i + 1;
            }
        }
        // Sort words
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        // Print words
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
