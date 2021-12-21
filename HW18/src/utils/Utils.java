package utils;

public class Utils {
    public static boolean containsDog(String string) {

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '@') return true;
        }
        return false;
    }
}

