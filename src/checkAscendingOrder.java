import java.util.Scanner;

public class checkAscendingOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];
    for(int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }
    //Checking for Ascending
    boolean asc = true;
    for(int i = 1; i < numbers.length; i++) {
      if(numbers[i] <= numbers[i-1]) {
        asc = false;
      }
    }
    if (asc == true) {
      System.out.println("The Array is Sorted in Ascending Order.");
    } else {
      System.out.println("The Array is Not Sorted in Ascending Order.");
    }
  }
}
