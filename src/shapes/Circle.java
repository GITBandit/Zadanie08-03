package shapes;

public class Circle extends GeometricShape {

    private double radius;

    public Circle(String name, double radius, Enum<ShapeType> shapeTypeEnum) {
        super(name, shapeTypeEnum);
        this.radius = radius;
    }

    @Override
    public String info() {
        return " posiadające promień o długości " + getRadius() + " ma pole powierzchni ";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
