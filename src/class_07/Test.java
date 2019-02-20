package class_07;

public class Test {
    public static void main(String[] args) {
        Thread thread;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }
}
