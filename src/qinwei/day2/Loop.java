package qinwei.day2;


import java.util.Arrays;
import java.util.List;

public class Loop {

    public static void main(String[] args) {
        loop3();
    }

    public static void loop1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void loop2() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        for (String child : list) {
            System.out.println(child);
        }
    }

    public static void loop3() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" i " + i);
            for (int j = 0; j < 3; j++) {
                if (i > 1) {
                    continue;
                }
                System.out.println(" j " + j);
            }
        }
    }
}
