package Shapes;

public abstract class GeometricShape extends Shape2D {

    private boolean isAGeometricShape;

    public GeometricShape(String name, double sideA, boolean isShape2D, boolean isAGeometricShape) {
        super(name, sideA, isShape2D);
        this.isAGeometricShape = isAGeometricShape;
    }

    public boolean isAGeometricShape() {
        return isAGeometricShape;
    }

    public void setAGeometricShape(boolean AGeometricShape) {
        isAGeometricShape = AGeometricShape;
    }
}
