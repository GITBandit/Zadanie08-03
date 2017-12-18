package Shapes;

public class Line2D extends Shape2D {

    public Line2D(String name, double sideA, boolean isShape2D) {
        super(name, sideA, isShape2D);
    }

    @Override
    public String info() {
        return " składająca się z odcinka o długości " + getSideA() + " ma długość ";
    }
}
