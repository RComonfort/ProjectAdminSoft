import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, h;

        n = scanner.nextInt();
        h = scanner.nextInt();

        int[] heights = new int[n];
        for(int i=0; i<n; i++) {
            heights[i] = scanner.nextInt();
        }

        System.out.println(minimunPossibleWidth(h, heights));
    }

    public static int minimunPossibleWidth(int fenceHeight, int[] heights) {
        int width = 0;

        for(int i=0; i<heights.length; i++) {
            if(heights[i] > fenceHeight) {
                width += 2;
            }
            else {
                width++;
            }
        }

        return width;
    }
}