package shapes;

public class Cube extends Shape3D {


    public Cube(String name, double sideA, Enum<ShapeType> shapeTypeEnum) {
        super(name, shapeTypeEnum, sideA );
    }

    @Override
    public String info() {
        return " posiadający bok o długości " + getSideA() + " ma objęctość ";
    }
}
