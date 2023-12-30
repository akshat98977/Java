import java.util.Scanner;

public class minAndMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for(int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
      if(i == 0) {
        max = numbers[i];
        min = numbers[i];
      } else {
        if (numbers[i] > max) {
          max = numbers[i];
        }
        if(numbers[i] < min){
          min = numbers[i];
        }
      }
    }
    System.out.println("Max Number is : "+ max);
    System.out.println("Min Number is : "+ min);

  }
}
