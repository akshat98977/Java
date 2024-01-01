import java.util.*;
public class tableOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++){

            System.out.print(num);
            System.out.print(" X ");
            System.out.print(i+1);
            System.out.print(" = ");
            System.out.println(num*(i+1));
        }
        sc.close();
        
    }
}
