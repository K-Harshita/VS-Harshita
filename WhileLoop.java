public class WhileLoop {
    public static void main(String[] args) {
        int a = 10, i = 0, sum = 0;
        while (i < a) {
            sum += i;
            System.out.println("The sum at the " + (i + 1) + "th iteration is : " + sum);
            i++;
        }
    }

}
