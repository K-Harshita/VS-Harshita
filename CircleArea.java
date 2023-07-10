import java.util.Scanner;
import java.lang.Math;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;

        System.out.println("the area of the circle is : " + area);
        sc.close();
    }
}
