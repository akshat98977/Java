import java.util.Scanner;

public class reverseString {
  public static void printRev(String str, int idx) {
    if (idx == 0) {
      System.out.println(str.charAt(idx));
      return;
    }

    System.out.println(str.charAt(idx));
    printRev(str, idx-1);
  }
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    StringBuilder sb = new StringBuilder("Hello");
//
//    for(int i = 0; i < sb.length()/2; i++) {
//      int front = i;
//      int back = sb.length() - 1 - i;
//      char frontChar = sb.charAt(front);
//      char backChar = sb.charAt(back);
//
//      sb.setCharAt(front, backChar);
//      sb.setCharAt(back, frontChar);
//    }
//    System.out.println(sb);

    //By Recursions
    String str = "abcd";
    printRev(str , str.length()-1);
  }
}


