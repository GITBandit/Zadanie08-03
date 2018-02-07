package shapes;

public class Ball extends Shape3D {

    public Ball(String name, Enum<ShapeType> shapeTypeEnum, double sideA/*, boolean isShape3D*/) {
        super(name, shapeTypeEnum, sideA);
    }

    @Override
    public String info() {
        return " posiadająca promień o długości " + getSideA() + " ma objęctość ";
    }
}
