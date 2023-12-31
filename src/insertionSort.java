import java.util.Scanner;

public class insertionSort {
    public static void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
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
      //Insertion Sort
      for (int i = 1; i < size; i++) {
        int current = numbers[i];
        int j = i - 1;
        while (j >= 0 && current < numbers[j]) {
          numbers[j + 1] = numbers[j];
          j--;
        }
        //Placement
        numbers[j + 1] = current;
      }
      printArray(numbers);
    }

}
