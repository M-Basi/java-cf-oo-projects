package gr.aueb.excercises.OOP.ch13;

import gr.aueb.excercises.OOP.ch13.model.PointXYZ;

public class mainPointXYZ {

    public static void main(String[] args) {
        PointXYZ a = new PointXYZ(2,2,2);

        System.out.println(a.convertToString());
        System.out.println(a.getXYDistance());
        System.out.println(a.getXZDistance());
        System.out.println(a.getYZDistance());
        System.out.println(a.getXYZDistance());
    }
}
