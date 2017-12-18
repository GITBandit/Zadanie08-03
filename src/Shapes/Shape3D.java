package Shapes;

public abstract class Shape3D extends Shape {

    private boolean isShape3D;

    public Shape3D(String name, double sideA, boolean isShape3D) {
        super(name, sideA);
        this.isShape3D = isShape3D;
    }

    public boolean isShape3D() {
        return isShape3D;
    }

    public void setShape3D(boolean shape3D) {
        isShape3D = shape3D;
    }


}
