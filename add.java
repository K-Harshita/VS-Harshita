import java.util.*;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();

        sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        sc.close();
    }
}