import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        scanner.close();

        System.out.println(capitalizeWord(word));
    }

    public static String capitalizeWord(String word) {
        if(word == null || word.length() == 0) return "";

        char[] capitalized = word.toCharArray();
        capitalized[0] = Character.toUpperCase(capitalized[0]);
        
        for(int i=1; i<word.length(); i++) {
            capitalized[i] = Character.toLowerCase(capitalized[i]);
        }

        return new String(capitalized);
    }
}