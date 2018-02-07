package shapes;

public abstract class Shape3D extends Shape {

    private double sideA;

    public Shape3D(String name, Enum<ShapeType> shapeTypeEnum, double sideA/*, boolean isShape3D*/) {
        super(name, shapeTypeEnum);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
