import java.util.Scanner;

public class printingNamesInArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] names = new String[size];
    sc.nextLine();
    //Inputing Names
    for(int i = 0; i < size; i++) {
      names[i] = sc.nextLine();
    }
    //Printing Names
    for(int i = 0; i < names.length; i++) {
      System.out.println("Name  " + (i+1)+ " is : "+ names[i]);
    }
    sc.close();
  }
}
