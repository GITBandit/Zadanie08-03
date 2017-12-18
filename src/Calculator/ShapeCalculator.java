package Calculator;

import Shapes.Ball;
import Shapes.Circle;
import Shapes.Cube;
import Shapes.Rectangle;

public class ShapeCalculator implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI*Math.pow(circle.getSideA(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return (rectangle.getSideA()*rectangle.getSideB());
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4/3.f*Math.PI*Math.pow(ball.getSideA(),3));
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSideA(),3);
    }
}
