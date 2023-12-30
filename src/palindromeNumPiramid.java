import java.util.Scanner;

public class palindromeNumPiramid {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int m = 4;
    //My CODE    Outer Loop
//    for (int i = 1; i <= n; i++) {
//      //Inner Loop -> Spaces
//      for (int j = 1; j <= n - i; j++) {
//        System.out.print(" ");
//      }
//      //Inner Loop -> First Half
//      for (int j = 1; j <= i; j++) {
//        System.out.print(i-j+1);
//      }
//      //Inner Loop -> Second Half
//      for (int j = 1; j <= i - 1; j++) {
//        System.out.print(j+1);
//      }
//      System.out.println();
//    }
    for (int i = 1; i <= n; i++) {
      //Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      //1st Half Numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      //2nd Half Numbers
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
