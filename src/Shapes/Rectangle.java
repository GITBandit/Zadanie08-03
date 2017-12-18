package Shapes;

public class Rectangle extends GeometricShape {


    public Rectangle(String name, double sideA, boolean isShape2D, boolean isAGeometricShape, double sideB) {
        super(name, sideA, isShape2D, isAGeometricShape, sideB);
    }

    public String info(){
        return " posiadający boki " + getSideA() + " i " + getSideB() + " ma pole powierzchni ";
    }
}
