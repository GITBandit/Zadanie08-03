package shapes;

public class Rectangle extends GeometricShape {

    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, Enum<ShapeType> shapeTypeEnum, double sideB) {
        super(name, shapeTypeEnum);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String info(){
        return " posiadający boki " + getSideA() + " i " + getSideB() + " ma pole powierzchni ";
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
