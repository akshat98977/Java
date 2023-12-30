import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();


    int matrix[][] = new int[n][m];
    for(int i=0; i<n; i++) {
      for(int j=0; j<m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    int[][] transpose = new int[m][n];
    for(int i=0; i<n; i++) {
      for (int j = 0; j < m; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    for(int i=0; i<m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }

  }
}









