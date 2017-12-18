package Shapes;

public class Circle extends GeometricShape {

    public Circle(String name, double sideA, boolean isShape2D, boolean isAGeometricShape, double sideB) {
        super(name, sideA, isShape2D, isAGeometricShape, sideB);
    }

    public Circle(String name, double sideA, boolean isShape2D, boolean isAGeometricShape) {
        super(name, sideA, isShape2D, isAGeometricShape);
    }

    @Override
    public String info() {
        return " posiadające promień o długości " + getSideA() + " ma pole powierzchni ";
    }
}
