public class Cone extends Shape{
    private double radius = 0.0;
    private double height = 0.0;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea () {
        double sideLength = Math.sqrt((height * height) + (radius * radius));
        return Math.PI * radius * (radius + sideLength);
    }

    @Override
    public double volume () {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public String toString () {
        return ("Surface area of Cone: " + surfaceArea() + ", Volume of Cone: " + volume());
    }
}
