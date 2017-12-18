package Calculator;

import Shapes.*;

public class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle) {
            return Math.PI * Math.pow(shape.getSideA(), 2);
        } else if (shape instanceof Rectangle) {
            return (shape.getSideA() * shape.getSideB());
        }
        return 0;
    }

/*    @Override
    public double circleArea(Circle circle) {
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
    }*/

    @Override
    public double volume(Shape3D shape) {
        if (shape instanceof Ball)
        return (4/3.f*Math.PI*Math.pow(shape.getSideA(),3));
            if (shape instanceof Cube)
        return Math.pow(shape.getSideA(),3);
        return 0;
    }

}
