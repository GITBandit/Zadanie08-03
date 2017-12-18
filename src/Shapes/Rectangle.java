package Shapes;

public class Rectangle extends GeometricShape {

    private double sideB;

    public Rectangle(String name, double sideA, boolean isShape2D, boolean isAGeometricShape, double sideB) {
        super(name, sideA, isShape2D, isAGeometricShape);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
