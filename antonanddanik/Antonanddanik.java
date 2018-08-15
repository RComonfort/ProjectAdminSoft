
import java.util.Scanner;

public class Antonanddanik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int anton = 0;
        int danik = 0;
        sc.nextLine();
        String matches = sc.nextLine();

        for(int i = 0; i < n; i++){
            if(matches.charAt(i) == 'A'){
                anton++;
            }
            else{
                danik++;
            }
        }

        if(anton > danik){
            System.out.println("Anton");
        }
        else if(danik > anton){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

        sc.close();
    }
}