public class ShapeTest {

    public static void main(String[] args) {
        // Create Shape objects using different constructors
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 6.0);
        Shape rectangle = new Shape(4, 8.0, 6.0);
        Shape triangle = new Shape(3, 7.0, 5.0, 9.0);
        Shape undefined = new Shape();

        // Invoke getShapeDetails for each object and store the results in String variables
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        String undefinedDetails = undefined.getShapeDetails();

        // Print the details of each Shape object
        System.out.println("Circle Details:\n" + circleDetails + "\n");
        System.out.println("Square Details:\n" + squareDetails + "\n");
        System.out.println("Rectangle Details:\n" + rectangleDetails + "\n");
        System.out.println("Triangle Details:\n" + triangleDetails + "\n");
        System.out.println("Undefined Details:\n" + undefinedDetails);
    }
}