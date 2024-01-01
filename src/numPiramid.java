import java.util.Scanner;

public class numPiramid {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = 5;
    
    //My CODE     Outer Loop
//    for (int i = 1; i <= n; i++) {
//      //Inner Loop -> Spaces
//      for (int j = 1; j <= n - i; j++) {
//        System.out.print(" ");
//      }
//      //Inner Loop -> First Half
//      for (int j = 1; j <= i; j++) {
//        if (j % 2 == 0) {
//          System.out.print(" ");
//        } else {
//          System.out.print(i);
//        }
//      }
//      //Inner Loop -> Second Half
//      for (int j = 1; j <= i - 1; j++) {
//        int sum = i + j;
//        if (sum % 2 == 0) {
//          System.out.print(" ");
//        } else {
//          System.out.print(i);
//        }
//      }
//      System.out.println();
//    }
    for (int i = 1; i <= n; i++) {
      //Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      //Numbers -> print row number, row no of times
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
