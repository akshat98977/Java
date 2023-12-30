import java.util.Scanner;

public class gcd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
//    int num3 = sc.nextInt();
//    int min;
//    int gcd = 1;
//    if (num1 < num2) {
//      min = num1;
//    }else{
//      min = num2;
//    }
//    for (int i = 1; i <= min; i++) {
//      if(num1 % i == 0 && num2 % i == 0) {
//        gcd = i;
//      }
//    }
//    System.out.println("GCD is "+ gcd);
    while(num1 != num2){
      if(num1 > num2){
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    System.out.println("GCD is "+ num2);
  }
}

