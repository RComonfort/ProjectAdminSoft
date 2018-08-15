import java.util.*;

public class BearAndBigBrother{

    public static void main(String args []){

        long l, b;

        Scanner sc = new Scanner(System.in);

        l = sc.nextLong();
        b = sc.nextLong();

        int count = 0;

        while(l <= b){
            count ++;

            l = l * 3;
            b = b * 2;

            
        }

        System.out.println(count);

    }

}