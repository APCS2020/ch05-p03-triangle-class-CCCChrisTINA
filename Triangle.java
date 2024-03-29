public class Triangle{
    private double base;
    private double height;

    public Triangle(){
        base = 1.0;
        height = 2.0;
    }
    public Triangle(double b, double h){
        base = b;
        height = h;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }

    public double getArea(){
        return height * base / 2;
    }
}
