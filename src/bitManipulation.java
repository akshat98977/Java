import java.util.Scanner;

public class bitManipulation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 5;//0101
    int pos = 2;
    int operation = sc.nextInt();

//    //Get Bit
//    int bitMask = 1<< pos;
//    if ((bitMask & n) == 0) {
//      System.out.println("Bit was Zero");
//    } else {
//      System.out.println("Bit was One");
//    }

//    //Set Bit
//    int bitMask = 1<<pos;
//    int newNumber = bitMask | n;
//    System.out.println(newNumber);

//    //Clear Bit
//    int bitMask = 1 << pos;
//    int notBitMask = ~(bitMask);
//    int newNumber = notBitMask & n;
//    System.out.println(newNumber);

    //Update Bit
    //Use Clear Bit Or Set Bit according to requirement.
    if (operation == 1) { // For operation 1 : Set  else : Clear
      int bitMask = 1<<pos;
      int newNumber = bitMask | n;
      System.out.println(newNumber);
    } else {
      int bitMask = 1 << pos;
      int notBitMask = ~(bitMask);
      int newNumber = notBitMask & n;
      System.out.println(newNumber);
    }
    sc.close();
  }
}
