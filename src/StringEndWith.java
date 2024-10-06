public class StringEndWith {
    public static void main (String[] args) {
        boolean isStringEnding = stringEndsWith("tomasz", "asz");
        System.out.println(isStringEnding);
        System.out.println(stringEndsWith("tomatoe", "asz"));
        System.out.println(stringEndsWith("tomatoe", "toe"));
        System.out.println(stringEndsWith("tomatoe", ""));
        System.out.println(stringEndsWith("", "asd"));

        System.out.println(stringEndsWith2("tomatoe", "toe"));
        System.out.println(stringEndsWith2("tomatoe", "asd"));
    }

    public static boolean stringEndsWith (String string, String ending) {
        if (string.endsWith(ending)) {
            return true;
        }
        return false;
    }

    public static boolean stringEndsWith2 (String string, String ending) {
        if (string.substring(string.length() - ending.length()).equals(ending)) {
            return true;
        }
        return false;
    }
}
