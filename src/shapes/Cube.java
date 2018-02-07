package shapes;

public class Cube extends Shape3D {


    public Cube(String name, double sideA, Enum<ShapeType> shapeTypeEnum/*boolean isShape3D*/) {
        super(name, shapeTypeEnum, sideA /*isShape3D*/);
    }

    @Override
    public String info() {
        return " posiadający bok o długości " + getSideA() + " ma objęctość ";
    }
}
