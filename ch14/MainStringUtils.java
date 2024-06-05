package gr.aueb.excercises.OOP.ch14;

public class MainStringUtils {

    public static void main(String[] args) {

        System.out.println(StringUtils.reverseString("marios"));
        System.out.println(StringUtils.UppercaseString("Marios"));
        boolean isPalindrome = StringUtils.isPalindrome("Never a foot too far, even.");
        System.out.println(isPalindrome);
    }
}
