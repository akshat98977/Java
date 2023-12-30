import java.util.Scanner;

public class rotatedHalfPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i; j++) {
                //cell -> (i,j)
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                //cell -> (i,j)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
