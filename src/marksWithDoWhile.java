import java.util.*;
public class marksWithDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int ans = sc.nextInt();
//        while (ans == 1) {
//            int marks = sc.nextInt();
//            if (marks >= 90) {
//                System.out.println("This is Good");
//            } else if (marks >= 60) {
//                System.out.println("This is also Good");
//            } else if (marks >= 0) {
//                System.out.println("This is Good as well");
//            } else {
//                System.out.println("Invalid Marks");
//            }
//            ans = sc.nextInt();
//        }
        int ans;
        do {
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid Marks");
            }
            System.out.println("Want To Continue ? (yes(1) or no(0))");
            ans = sc.nextInt();
        } while (ans == 1);
        sc.close();
    }
}