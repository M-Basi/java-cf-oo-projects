package gr.aueb.excercises.OOP.ch16.project1;

public class AbstractShape implements IShape {
    private long id;

    public AbstractShape(){

    }

    public AbstractShape(long id) {
        this.id = id;
    }

    @Override
    public double getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


