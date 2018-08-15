import java.util.Scanner;

public class Team
{
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int problems = 0;

        for (int i = 0; i < n; i++)
        {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if ((num1 + num2 + num3) >= 2)
                problems++;
        }

        System.out.println(problems);
    }    
}