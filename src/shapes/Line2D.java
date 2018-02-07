package shapes;

public class Line2D extends Shape2D {

    private double point1X;
    private double point1Y;
    private double point2X;
    private double point2Y;
    private boolean onePoint = false;

    public Line2D(String name, double point1X, double point1Y, double point2X, double point2Y, Enum<ShapeType> shapeTypeEnum /*boolean isShape2D*/) {
        super(name, shapeTypeEnum);
        this.point1X = point1X;
        this.point1Y = point1Y;
        this.point2X = point2X;
        this.point2Y = point2Y;
    }

    public Line2D(String name, double point1X, double point1Y, Enum<ShapeType> shapeTypeEnum /*boolean isShape2D*/) {
        super(name, shapeTypeEnum);
        this.point1X = point1X;
        this.point1Y = point1Y;
        this.onePoint = true;
    }


    @Override
    public String info() {
        return " dla punktów o współrzędnych [" + getPoint1X() + ";" + getPoint1Y() + "] [" + getPoint2X() + ";" + getPoint2Y() + "] ma długość ";
    }


    public double getPoint1X() {
        return point1X;
    }

    public void setPoint1X(double point1X) {
        this.point1X = point1X;
    }

    public double getPoint1Y() {
        return point1Y;
    }

    public void setPoint1Y(double point1Y) {
        this.point1Y = point1Y;
    }

    public double getPoint2X() {
        return point2X;
    }

    public void setPoint2X(double point2X) {
        this.point2X = point2X;
    }

    public double getPoint2Y() {
        return point2Y;
    }

    public void setPoint2Y(double point2Y) {
        this.point2Y = point2Y;
    }

    public boolean isOnePoint() {
        return onePoint;
    }

    public void setOnePoint(boolean onePoint) {
        this.onePoint = onePoint;
    }
}
