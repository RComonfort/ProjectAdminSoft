
import java.util.HashSet;
import java.util.Scanner;

public class Boyorgirl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        HashSet<Character> letters = new HashSet<>();

        for(int i = 0; i < username.length(); i++){
            letters.add(username.charAt(i));
        }

        if(letters.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}