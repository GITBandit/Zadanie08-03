package shapes;

public abstract class GeometricShape extends Shape2D {

    private boolean isAGeometricShape;
    private double sideA;
    private double sideB;

    public GeometricShape(String name, double sideA, Enum<ShapeType> shapeTypeEnum, /*boolean isShape2D,*//* boolean isAGeometricShape,*/ double sideB) {
        super(name, shapeTypeEnum /*sideA, *//*isShape2D*/);
        this.sideA = sideA;
        /*this.isAGeometricShape = isAGeometricShape;*/
        this.sideB = sideB;
    }

    public GeometricShape(String name, double sideA,Enum<ShapeType> shapeTypeEnum /*boolean isShape2D, boolean isAGeometricShape*/) {
        super(name, shapeTypeEnum /* sideA, *//*isShape2D*/);
        this.sideA = sideA;
        /*this.isAGeometricShape = isAGeometricShape;*/
    }

/*
    public boolean isAGeometricShape() {
        return isAGeometricShape;
    }

    public void setAGeometricShape(boolean AGeometricShape) {
        isAGeometricShape = AGeometricShape;
    }
*/

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public boolean isAGeometricShape() {
        return isAGeometricShape;
    }

    public void setAGeometricShape(boolean AGeometricShape) {
        isAGeometricShape = AGeometricShape;
    }
}
