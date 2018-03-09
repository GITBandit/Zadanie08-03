package shapes;

public abstract class GeometricShape extends Shape2D {

    public GeometricShape(String name, Enum<ShapeType> shapeTypeEnum) {
        super(name, shapeTypeEnum);
    }
}
