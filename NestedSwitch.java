public class NestedSwitch {
    public static void main(String[] args) {
        int val1 = 2, val2 = 2;
        switch (val1) {
            case 1:
                System.out.println("the val is 1");
                break;

            case 2:
                switch (val2) {
                    case 1:
                        System.out.println("nested val is 1");
                        break;
                    case 2:
                        System.out.println("nested val is 2");
                        break;
                }
        }
    }
}
