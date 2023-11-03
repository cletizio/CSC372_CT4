public class Cylinder extends Shape{
    private double radius = 0.0;
    private double height = 0.0;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume(){
        return Math.PI * Math.pow(radius,2) * height;
    }

    public String toString () {
        return ("Surface area of Cylinder: " + surfaceArea() + ", Volume of Cylinder: " + volume());
    }
}
