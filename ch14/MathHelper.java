package gr.aueb.excercises.OOP.ch14;

public class MathHelper {


    private MathHelper() {

    }

    public static int findMin(int [] arr) throws Exception {
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            int min = Integer.MAX_VALUE;
            for (int item: arr) {
                if (item < min) {
                    min = item;
                }
            }
        return min;
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static int findMax(int [] arr) throws Exception {
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            int max = Integer.MIN_VALUE;
            for (int item: arr) {
                if (item > max) {
                    max = item;
                }
            }
            return max;
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static double findAverage(int [] arr) throws Exception {
        try {
            if (arr.length == 0) {
                throw new Exception("Array is empty");
            }
            double total = 0;

            for (int item: arr) {
                total += item;
            }
            return total / arr.length;
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
