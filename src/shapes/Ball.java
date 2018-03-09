package shapes;

public class Ball extends Shape3D {

    private double radius;

    public Ball(String name, Enum<ShapeType> shapeTypeEnum, double radius) {
        super(name, shapeTypeEnum);
        this.radius = radius;
    }

    @Override
    public String info() {
        return " posiadająca promień o długości " + getRadius() + " ma objęctość ";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
