package gr.aueb.excercises.OOP.ch13.exc1.model;

/**
 *
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public  PointXYZ(){

    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
        return "(x: " + x + ", y: " + y + ", z: " + z + ")";
    }

    public double getXYDistance() {
        return Math.sqrt((Math.pow(Math.abs(x), 2)) + (Math.pow(Math.abs(y), 2)));

    }
     public double getYZDistance() {
         return Math.sqrt((Math.pow(Math.abs(y), 2)) + (Math.pow(Math.abs(z), 2)));
     }

    public double getXZDistance() {
        return Math.sqrt((Math.pow(Math.abs(x), 2)) + (Math.pow(Math.abs(z), 2)));
    }
    public double getXYZDistance() {
        return Math.sqrt((Math.pow(Math.abs(x), 2)) + (Math.pow(Math.abs(y), 2)) +(Math.pow(Math.abs(z), 2)));
    }
}
