package class_06;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("KotlinTest.iml");

        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }
}
