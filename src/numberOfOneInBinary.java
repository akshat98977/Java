import java.util.Scanner;

public class numberOfOneInBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int oneCount = 0;
    for (int i = 0; i < 33; i++) {
      int bitMask = 1 << i;
      int newNumber = bitMask & number;
      if (newNumber != 0) {
        oneCount++;
      }
    }
    System.out.println("Number of 1's : "+ oneCount);
    sc.close();
  }
}
