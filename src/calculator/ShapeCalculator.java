package calculator;

import shapes.*;

import static shapes.ShapeType.*;

public class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_CIRCLE)) {
            return Math.PI * Math.pow(((Circle)shape).getRadius(), 2);
        } else if (shape.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_RECTANGLE)) {
            return (((Rectangle)shape).getSideA() * ((Rectangle)shape).getSideB());
        }
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape.getShapeTypeEnum().equals(SHAPE_3D_BALL))
        return (4/3.f*Math.PI*Math.pow(((Ball)shape).getRadius(),3));
            if (shape.getShapeTypeEnum().equals(SHAPE_3D_CUBE))
        return Math.pow(((Cube)shape).getSideA(),3);
        return 0;
    }

}
