package shapes;

public abstract class Shape {

    private String name;
    private Enum<ShapeType> shapeTypeEnum;
    //private double sideA;

    public Shape(String name, Enum<ShapeType> shapeTypeEnum/*, double sideA*/) {
        this.name = name;
        this.shapeTypeEnum = shapeTypeEnum;
        //this.sideA = sideA;
    }

    public String getName() {
        return name;
    }

    public abstract String info();

    public void setName(String name) {
        this.name = name;
    }

/*    public double getSideA() {
        return sideA;
    }*/

   /* public void setSideA(double sideA) {
        this.sideA = sideA;
    }
*/

    public Enum<ShapeType> getShapeTypeEnum() {
        return shapeTypeEnum;
    }

    public void setShapeTypeEnum(Enum<ShapeType> shapeTypeEnum) {
        this.shapeTypeEnum = shapeTypeEnum;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                //", sideA=" + sideA +
                '}';
    }


}
