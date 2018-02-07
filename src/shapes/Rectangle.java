package shapes;

public class Rectangle extends GeometricShape {


    public Rectangle(String name, double sideA, Enum<ShapeType> shapeTypeEnum, /*boolean isShape2D, boolean isAGeometricShape,*/ double sideB) {
        super(name, sideA, shapeTypeEnum /*isShape2D, isAGeometricShape*/, sideB);
    }

    public String info(){
        return " posiadający boki " + getSideA() + " i " + getSideB() + " ma pole powierzchni ";
    }
}
