import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int len = sc.nextInt();

        System.out.println("Enter the breadth of the rectangle");
        int br = sc.nextInt();

        int area = len * br;

        System.out.println("the area of the rectangle is : " + area);
        sc.close();
    }
}
