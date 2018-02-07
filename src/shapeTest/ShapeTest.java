package shapeTest;

import calculator.LineCalc;
import calculator.ShapeCalculator;
import shapes.*;

import static shapes.ShapeType.*;


public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();
        LineCalc lineCalculator = new LineCalc();

        Shape[] shapes = new Shape[6];
        shapes[0] = new Cube("Sześcian",4,SHAPE_3D_CUBE);
        shapes[1] = new Ball("Kula",SHAPE_3D_BALL, 1);
        shapes[2] = new Line2D("Linia",-2, 2, 1, 6, SHAPE_2D_LINE);
        shapes[3] = new Rectangle("Prostokąt",2,SHAPE_2D_GEOMETRIC_SHAPE_RECTANGLE,4);
        shapes[4] = new Circle("Kółko", 3,SHAPE_2D_GEOMETRIC_SHAPE_CIRCLE);
        shapes[5] = new Line2D("Linia (jeden punkt)", 4,-7, SHAPE_2D_LINE);


            for (Shape sh: shapes) {
                if (sh.getShapeTypeEnum().equals(SHAPE_2D_LINE)){
                    System.out.println(sh.getName() + sh.info() +  lineCalculator.lineLength((Line2D)sh));
                } else if (sh.getShapeTypeEnum().equals(SHAPE_3D_BALL) || sh.getShapeTypeEnum().equals(SHAPE_3D_CUBE)) {
                    System.out.println(sh.getName() + sh.info() + calculator.volume((Shape3D) sh));
                } else if (sh.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_CIRCLE) || sh.getShapeTypeEnum().equals(SHAPE_2D_GEOMETRIC_SHAPE_CIRCLE)){
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
