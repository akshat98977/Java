import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int num = 1; //Take a variable num amd inc it after every print
        //outer loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
