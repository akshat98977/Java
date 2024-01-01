import java.util.Scanner;

import static java.lang.Math.pow;

public class decToBinaryOrViceVersa {
  public static void decimalToBinary(int num ) {
    StringBuilder str = new StringBuilder();
    do{
      int rem = num % 2;
      num /= 2;
      str.append(rem);
    } while (num > 0);
    for ( int i = str.length()-1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
  }

  public static void binaryToDecimal(int num) {
    int deci = 0;
    int i = 0;
    do {
      deci += (num % 10) * pow(2,i);
      num /= 10;
      i++;
    } while (num > 0);
    System.out.println(deci);
  }




  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int query = sc.nextInt();
    if (query == 1) {
      decimalToBinary(number);
    } else if (query == 2) {
      binaryToDecimal(number);
    } else {
      System.out.println("Invalid Input");
    }
    sc.close();
  }
}
