package ShapeTest;

import Calculator.LineCalc;
import Calculator.ShapeCalculator;
import Shapes.*;

import javax.sound.sampled.Line;

public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();
        LineCalc lineCalculator = new LineCalc();

        Cube cube1 = new Cube("Sześcian",4,true);
        System.out.println(calculator.cubeVolume(cube1));

        Ball ball1 = new Ball("Kula",1,true);
        System.out.println(calculator.ballVolume(ball1));

        Line2D line1 = new Line2D("Linia",5,true);
        System.out.println(lineCalculator.lineLength(line1));

        Rectangle rectangle1 = new Rectangle("Prostokąt",2,true,true,4);
        System.out.println(calculator.rectangleArea(rectangle1));

        Circle circle1 = new Circle("Kółko", 3,true, true);
        System.out.println(calculator.circleArea(circle1));
    }


}
