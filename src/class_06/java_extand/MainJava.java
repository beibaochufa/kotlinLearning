package class_06.java_extand;

public class MainJava {
    public static void printName(JavaAnimal animal) {
//        System.out.println("JavaAnimal");
        animal.name();
    }
    public static void printName(JavaDog javaDog){
//        System.out.println("JavaDog");
        javaDog.name();
    }

    public static void main(String[] args) {
//        JavaAnimal javaAnimal = new JavaAnimal();
//        JavaDog javaDog = new JavaDog();
        JavaDog javaDog = new JavaDog();
        printName((JavaAnimal) javaDog);

//        javaAnimal.name();
//        javaDog.name();
//        javaDogAnimal.name();
//        printName(javaAnimal);
//        printName(javaDog);
//        printName(javaDogAnimal);
    }
}
