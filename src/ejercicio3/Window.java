package ejercicio3;

abstract class Shape {
    public abstract boolean overlaps(Shape s);
    public abstract int getArea();
}

public class Window {

    private Shape shape;

    public Window(Shape shape) {
        this.shape = shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public boolean overlaps(Window w){
        return shape.overlaps(w.shape);
    }
    public int getArea(){
        return shape.getArea();
    }
}
