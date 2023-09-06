public class Shape {
    private String shapeName;
    private int numberOfEdges;

    // Basic constructor
    public Shape() {
        System.out.println("Shape object created.");
        shapeName = "Undefined shape";
    }

    // Constructor for a circle
    public Shape(double radius) {
        System.out.println("Circle object created.");
        shapeName = "Circle";
        numberOfEdges = 0;
    }

    // Constructor for a square
    public Shape(int edges, double edgeLength) {
        System.out.println("Square object created.");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    // Constructor for a rectangle
    public Shape(int edges, double e1, double e2) {
        System.out.println("Rectangle object created.");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    // Constructor for a triangle
    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Triangle object created.");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        return "Shape Name: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}