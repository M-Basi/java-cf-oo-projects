package gr.aueb.excercises.OOP.ch16.project2;

public class Line extends AbstractShape implements ILine{
    private double length;

    public Line(){

    }

    public Line(double length) {
        this.length = length;
    }
}
