package shapes;

public abstract class GeometricShape extends Shape2D {

    private double sideA;
    private double sideB;

    public GeometricShape(String name, double sideA, Enum<ShapeType> shapeTypeEnum,double sideB) {
        super(name, shapeTypeEnum);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public GeometricShape(String name, double sideA,Enum<ShapeType> shapeTypeEnum) {
        super(name, shapeTypeEnum);
        this.sideA = sideA;
    }

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


}
