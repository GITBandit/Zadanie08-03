package shapes;

public abstract class Shape {

    private String name;
    private Enum<ShapeType> shapeTypeEnum;

    public Shape(String name, Enum<ShapeType> shapeTypeEnum) {
        this.name = name;
        this.shapeTypeEnum = shapeTypeEnum;
    }

    public String getName() {
        return name;
    }

    public abstract String info();

    public void setName(String name) {
        this.name = name;
    }

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
