import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r, t;

        System.out.print("Entre Vlaue :");
        t = sc.nextDouble(); 

        final double PI = 3.14;

        r = t * t * PI;

        System.out.print("the area of a circle :" + r);
    }
}
