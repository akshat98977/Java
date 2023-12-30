import java.util.Scanner;

public class halfPiramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
