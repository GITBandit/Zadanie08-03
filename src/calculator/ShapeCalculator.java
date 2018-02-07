package calculator;

import shapes.*;

import static shapes.ShapeType.*;

public class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_CIRCLE)) {
            return Math.PI * Math.pow(shape.getSideA(), 2);
        } else if (shape.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_RECTANGLE)) {
            return (shape.getSideA() * shape.getSideB());
        }
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape.getShapeTypeEnum().equals(SHAPE_3D_BALL))
        return (4/3.f*Math.PI*Math.pow(shape.getSideA(),3));
            if (shape.getShapeTypeEnum().equals(SHAPE_3D_CUBE))
        return Math.pow(shape.getSideA(),3);
        return 0;
    }

}
