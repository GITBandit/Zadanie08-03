package shapes;

public class Cube extends Shape3D {

    private double sideA;

    public Cube(String name, double sideA, Enum<ShapeType> shapeTypeEnum) {
        super(name, shapeTypeEnum);
        this.sideA = sideA;
    }

    @Override
    public String info() {
        return " posiadający bok o długości " + getSideA() + " ma objęctość ";
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
