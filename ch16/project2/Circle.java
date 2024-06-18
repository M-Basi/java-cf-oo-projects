package gr.aueb.excercises.OOP.ch16.project2;

public class Circle extends AbstractShape implements ICircle{
    private double radius;



    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return radius*2;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(radius) * Math.PI);
    }

    @Override
    public long getCircumference() {
        return (long)(2* Math.PI* radius);
    }


}
