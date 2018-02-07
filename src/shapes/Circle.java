package shapes;

public class Circle extends GeometricShape {

    public Circle(String name, double sideA, Enum<ShapeType> shapeTypeEnum) {
        super(name, sideA,shapeTypeEnum);
    }

    @Override
    public String info() {
        return " posiadające promień o długości " + getSideA() + " ma pole powierzchni ";
    }
}
