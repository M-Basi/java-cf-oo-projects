package gr.aueb.excercises.OOP.ch16.project1;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    public Circle(){

    }

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(this.radius) * Math.PI);
    }
}
