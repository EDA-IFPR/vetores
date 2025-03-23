import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayT);
        Arrays.sort(arrayS);

        return Arrays.equals(arrayS, arrayT);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "cat"));
    }
}
