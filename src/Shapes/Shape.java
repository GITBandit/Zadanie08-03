package Shapes;

public abstract class Shape {

    private String name;
    private double sideA;

    public Shape(String name, double sideA) {
        this.name = name;
        this.sideA = sideA;
    }

    public String getName() {
        return name;
    }

    public abstract String info();

    public void setName(String name) {
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", sideA=" + sideA +
                '}';
    }


}
