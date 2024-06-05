package gr.aueb.excercises.OOP.ch14;

public class ValidationUtils {

    private ValidationUtils() {

    }

    public static boolean StringLengthIsBetweenNum1Num2 (String s, int num1, int num2) {
        return !s.isEmpty() && s.length() >= num1 && s.length() <=num2;
    }

    public static boolean numIsBetweenNum1Num2 (int num, int num1, int num2) {
        return num >= num1 && num <=num2;
    }

}
