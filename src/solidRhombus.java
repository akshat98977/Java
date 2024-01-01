import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
//        My CODE
//        Outer Loop
//        for (int i = 1; i <= n; i++) {
//            //Inner Loop -> Spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            //Inner Loop -> star first
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            //Inner Loop -> star second
//            for (int j = 1; j <= m - i + 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
