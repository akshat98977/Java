import java.util.Scanner;

public class powerOf2UsingBits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean isPower = true;
    for (int i = 0; i < 33; i++) {
      int bitMask = 1 << i;
      int notBitMask = ~(bitMask);
      int newNumber = notBitMask & number;
      if (newNumber == 0) {
        break;
      } else if (i == 32){

        isPower = false;
      }

    }
    if (isPower) {
      System.out.println(number + " is a Power of 2");
    } else {
      System.out.println(number + " is not a Power of 2");
    }
  }
}
