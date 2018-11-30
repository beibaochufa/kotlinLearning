package class_09;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("heihei");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
