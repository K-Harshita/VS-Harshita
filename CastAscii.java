public class CastAscii {
    public static void main(String[] args) {
        char ch = 'h';
        int ascii = ch;

        int castascii = (int) ch;

        System.out.println("The ascii value of " + ch + "is : " + ascii);
        System.out.println("The casted ascii value of " + ch + "is : " + castascii);
    }
}
