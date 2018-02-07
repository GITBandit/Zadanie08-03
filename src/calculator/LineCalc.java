package calculator;

import shapes.Line2D;
import shapes.Shape;

public class LineCalc {

    public double lineLength(Line2D line){

        if(line.isOnePoint()){
            return 0;
        }

        double resultPower2 = Math.pow((line.getPoint1X() - line.getPoint2X()),2) + Math.pow((line.getPoint1Y() - line.getPoint2Y()),2);


        return Math.sqrt(resultPower2);
    }
}
