import java.util.Scanner;

public class bubbleSort {
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
    //Bubble Sort
    for(int i = 0; i < size-1; i++) {
      for (int j = 0; j < size - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j + 1];
          numbers[j + 1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }
    printArray(numbers);
    sc.close();
  }
}
