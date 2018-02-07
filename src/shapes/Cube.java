package shapes;

public class Cube extends Shape3D {


    public Cube(String name, double sideA, boolean isShape3D) {
        super(name, sideA, isShape3D);
    }

    @Override
    public String info() {
        return " posiadający bok o długości " + getSideA() + " ma objęctość ";
    }
}
