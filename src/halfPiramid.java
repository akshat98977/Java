import java.util.Scanner;
//limit of inner loop is value of i
//Num of Column is Num of Row
public class halfPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                //cell -> (i,j)
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
