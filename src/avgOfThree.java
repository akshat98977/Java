import java.util.Scanner;

public class avgOfThree {
  public static double circum(float a) {
    return (2*3.14*a);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
//    int num3 = sc.nextInt();
    int min;
    int gcd = 1;
    if (num1 < num2) {
      min = num1;
    }else{
      min = num2;
    }
    for (int i = 1; i <= min; i++) {
      if(num1 % i == 0 && num2 % i == 0) {
        gcd = i;
      }
    }
    System.out.println("GCD is "+ gcd);
    sc.close();
  }
}
