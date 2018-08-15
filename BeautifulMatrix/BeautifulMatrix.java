import java.util.Scanner;

public class BeautifulMatrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int rowWith1 = -1;
        int colWith1 = -1;

        for (int row = 0; row < 5; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                if (sc.nextInt() == 1)
                {
                    rowWith1 = row + 1;
                    colWith1 = col + 1;
                }
            }
        }

        int movesNeeded = Math.abs(3 - rowWith1) + Math.abs(3 - colWith1);

        System.out.println(movesNeeded);
    }
}