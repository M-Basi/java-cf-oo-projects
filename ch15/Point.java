package gr.aueb.excercises.OOP.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String convertToString() {
        return "(" + x + ")";
    }

    //API
    public void movePlus10() {
        x += 10;

    }
    public void movePlusOne() {
        x++;
    }

    protected void reset() {
        x = 0;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt((Math.pow(Math.abs(x-0), 2)));

    }
}
