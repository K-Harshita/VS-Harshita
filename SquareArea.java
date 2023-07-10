import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        int area = side * side;

        System.out.println("the area of the square is : " + area);
        sc.close();
    }
}
