import java.util.*;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor : ");
        int b = sc.nextInt();
        int quotient = a / b;
        int reminder = a % b;

        System.out.println("Quotient = " + quotient);
        System.out.println("Reminder = " + reminder);

        sc.close();
    }
}
