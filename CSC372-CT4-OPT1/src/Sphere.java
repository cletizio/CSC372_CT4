public class Sphere extends Shape{
    private double radius = 0.0;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }

    public String toString(){
        return ("Surface area of Sphere: " + surfaceArea() + ", Volume of Sphere: " + volume());
    }
}
