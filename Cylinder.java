public class Cylinder {
    
private Circle base;
private double height;

    public Cylinder(double radius, double height){
        this.base = new Circle(radius);
        this.height = height;

    }

    public double vol(){
        return base.area()*height;
    }

    public double sa(){
        return (base.area() * 2) + (base.circumference()*height);
    }
}
