package ShapeTest;

import Calculator.LineCalc;
import Calculator.ShapeCalculator;
import Shapes.*;

import javax.sound.sampled.Line;

public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();
        LineCalc lineCalculator = new LineCalc();

        Shape[] shapes = new Shape[5];
        shapes[0] = new Cube("Sześcian",4,true);
        shapes[1] = new Ball("Kula",1,true);
        shapes[2] = new Line2D("Linia",5,true);
        shapes[3] = new Rectangle("Prostokąt",2,true, true,4);
        shapes[4] = new Circle("Kółko", 3,true, true);


            for (Shape sh: shapes) {
                if (sh instanceof Line2D){
                    System.out.println(sh.getName() + sh.info() +  lineCalculator.lineLength(sh) + " :)");
                } else if (sh instanceof Shape3D) {
                    System.out.println(sh.getName() + sh.info() + calculator.volume((Shape3D) sh));
                } else if (sh instanceof GeometricShape){
                    System.out.println(sh.getName() + sh.info() + calculator.shapeArea((GeometricShape) sh));
                }
            }



/*        ShapeCalculator calculator = new ShapeCalculator();
        LineCalc lineCalculator = new LineCalc();

        Shape3D cube1 = new Cube("Sześcian",4,true);
        System.out.println(calculator.volume(cube1));

        Shape3D ball1 = new Ball("Kula",1,true);
        System.out.println(calculator.volume(ball1));

        Line2D line1 = new Line2D("Linia",5,true);
        System.out.println(lineCalculator.lineLength(line1));

        GeometricShape rectangle1 = new Rectangle("Prostokąt",2,true, true,4);
        System.out.println(calculator.shapeArea(rectangle1));

        GeometricShape circle1 = new Circle("Kółko", 3,true, true);
        System.out.println(calculator.shapeArea(circle1));*/
    }


}
