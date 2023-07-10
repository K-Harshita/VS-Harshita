import java.util.Scanner;

// import java.String.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {

            for (int j = a - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k + 1 + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
