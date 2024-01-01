import java.util.Scanner;

public class stringBuilder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    System.out.println(sb.charAt(0));

    sb.setCharAt(0, 'P');
    System.out.println(sb);

    sb.insert(0,'S');
    System.out.println(sb);

    sb.delete(2,3);
    System.out.println(sb);

    sb.append("hello");
    System.out.println(sb);
    sc.close();
  }
}
