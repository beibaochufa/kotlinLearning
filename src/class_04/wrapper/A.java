package class_04.wrapper;

public class A implements AInterface {
    public static final A a = new A();

    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("Integer");
    }
}
