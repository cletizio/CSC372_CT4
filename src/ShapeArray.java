public class ShapeArray {
    public static void main(String[] args){
        Sphere sphere = new Sphere(4.0);
        Cone cone = new Cone( 5.0, 8.0);
        Cylinder cylinder = new Cylinder(6.0,9.0);

        Shape[] shapeArray = {sphere, cone, cylinder};

        for (Shape shape : shapeArray){
            System.out.println(shape.toString());
        }
    }
}
