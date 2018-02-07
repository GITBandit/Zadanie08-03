package shapes;

public class Rectangle extends GeometricShape {


    public Rectangle(String name, double sideA, Enum<ShapeType> shapeTypeEnum, double sideB) {
        super(name, sideA, shapeTypeEnum , sideB);
    }

    public String info(){
        return " posiadający boki " + getSideA() + " i " + getSideB() + " ma pole powierzchni ";
    }
}
