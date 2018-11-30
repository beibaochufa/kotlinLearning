package class_04.null_safe;

public class NullSafe {
    public static String format(String string) {
        return string.isEmpty() ? null : string;
    }
}
