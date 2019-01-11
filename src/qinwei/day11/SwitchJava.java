package qinwei.day11;

public class SwitchJava {


    public static void test(int whate) {
        switch (whate) {
            case 0:
                System.out.println(0 + "\n");
                break;
            case 1:
                System.out.println(1 + "\n");
                break;
            default:
                System.out.println(2 + "\n");
                break;
        }
    }

    public static void main(String[] args) {
        test(4);
    }
}
