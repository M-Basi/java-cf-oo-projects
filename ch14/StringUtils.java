package gr.aueb.excercises.OOP.ch14;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString (String s) {
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        String revStr = reverse.toString();
        return revStr;

//        String reverse ="";
//        for (int i = s.length()-1; i >= 0; i--){
//            reverse += s.charAt(i);
//        }
//        return reverse;

    }

    public static String UppercaseString (String s) {
       return s.toUpperCase();
    }

    public static boolean isPalindrome(String s) {
        String reverse = UppercaseString(reverseStringWithoutBlanks(s));
        String word = UppercaseString(stringWithoutBlanks(s));
        return word.equals(reverse);
    }

    private static String reverseStringWithoutBlanks (String s) {
        StringBuilder reverse = new StringBuilder();
        String revStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' || s.charAt(i) == ','
                    || s.charAt(i) == '!' || s.charAt(i) == '.'
                    || s.charAt(i) == '?' || s.charAt(i) == '\''
                    || s.charAt(i) == ':') {
                continue;
            }
            reverse.append(s.charAt(i));
        }
        revStr = reverse.toString();
        return revStr;
    }

    private static String stringWithoutBlanks (String s) {
        StringBuilder newS = new StringBuilder();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == ','
                    || s.charAt(i) == '!' || s.charAt(i) == '\''
                    || s.charAt(i) == '.' || s.charAt(i) == '?'
                    || s.charAt(i) == ':') {
                continue;
            }
            newS.append(s.charAt(i));
        }
        str = newS.toString();
        return str;
    }
}
