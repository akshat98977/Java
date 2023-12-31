import java.util.Scanner;

public class selectionSort {
  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }
    //Time Complexity = O(n^2)
    //Selection sort
    for(int i = 0; i < size-1; i++) {
      int small = i;
      for (int j = i + 1; j < size; j++) {
        if (numbers[small] > numbers[j]) {
          small = j;
        }
      }
      int temp = numbers[small];
      numbers[small] = numbers[i];
      numbers[i] = temp;
    }
    printArray(numbers);
  }
}
