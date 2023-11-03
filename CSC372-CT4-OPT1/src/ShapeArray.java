public class ShapeArray {
    public static void main(String[] args){
        Sphere sphere = new Sphere(4.0);

        Shape[] shapeArray = { sphere};

        for (Shape shape : shapeArray){
            System.out.println(shape.toString());
        }
    }
}
