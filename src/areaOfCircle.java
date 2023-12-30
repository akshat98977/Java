import java.util.*;

public class areaOfCircle  {
    public static void main(String[] args) {

        final float PI = 3.14F;
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = PI * radius * radius;
        float circum = 2 * PI * radius;
        System.out.println(area);
        System.out.println(circum);

    }
}
