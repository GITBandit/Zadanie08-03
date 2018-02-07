package shapes;

public class Ball extends Shape3D {

    public Ball(String name, double sideA, boolean isShape3D) {
        super(name, sideA, isShape3D);
    }

    @Override
    public String info() {
        return " posiadająca promień o długości " + getSideA() + " ma objęctość ";
    }
}
