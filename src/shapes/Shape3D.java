package shapes;

public abstract class Shape3D extends Shape {

    private boolean isShape3D;
    private double sideA;

    public Shape3D(String name, double sideA, boolean isShape3D) {
        super(name/*, sideA*/);
        this.isShape3D = isShape3D;
        this.sideA = sideA;
    }

    public boolean isShape3D() {
        return isShape3D;
    }

    public void setShape3D(boolean shape3D) {
        isShape3D = shape3D;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
