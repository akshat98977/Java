
import java.util.*;

public class Main {
  static int evenlyDivides(int N){
    // code here
    int count = 0;
    while(N > 0){
        int rem = N % 10;
        if(N % rem == 0){
            count++;
        }
        N /= 10;
    }
    return count;
}
  public static void main(String[] args) {
    System.out.println(evenlyDivides(2446));
  }
}



