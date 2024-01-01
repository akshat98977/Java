import java.util.Scanner;

public class fibbonaci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int term1 = 0;
    int term2 = 1;
    int temp;
    System.out.println(term1 + " ");
    if (n > 1) {
      for (int i = 2; i <= n; i++){
        System.out.println(term2 + " ");
        temp = term1 + term2;
        term1 = term2;
        term2 = temp;
      }
    }
    sc.close();
  }
}
