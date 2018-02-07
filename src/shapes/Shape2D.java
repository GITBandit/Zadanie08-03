package shapes;

public abstract class Shape2D extends Shape {

    //private boolean isShape2D;

    public Shape2D(String name, Enum<ShapeType> shapeTypeEnum /*double sideA, *//*boolean isShape2D*/) {
        super(name, shapeTypeEnum/*, sideA*/);

        //this.isShape2D = isShape2D;
    }

/*    public boolean isShape2D() {
        return isShape2D;
    }

    public void setShape2D(boolean shape2D) {
        isShape2D = shape2D;
    }*/
}
