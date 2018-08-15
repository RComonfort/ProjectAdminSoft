import java.util.*;

public class Word{

    public static void main(String args[]){
        
        String s = new String();

        int l = 0, u = 0;
        char ch;

        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);

            if(ch >= 'A' && ch <='Z'){
                u++;
            }
            else{
                l++;
            }

        }

        s = l >= u ? s.toLowerCase() : s.toUpperCase();

        System.out.println(s);

    }

}