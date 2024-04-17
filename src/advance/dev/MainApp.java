package advance.dev;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        // Input shapes
        // example: shapes[0] = new Circle(5);

        // Print shapes
        // example: shapes[0].print(shapes);

        // Find shape with largest area
        Shape largestShape = findLargestArea(shapes);
        System.out.println("Largest shape area: " + largestShape.dienTich());

        // Find largest area for each shape type
        double largestCircleArea = findLargestCircleArea(shapes);
        double largestRectangleArea = findLargestRectangleArea(shapes);
        double largestTriangleArea = findLargestTriangleArea(shapes);

        System.out.println("Largest circle area: " + largestCircleArea);
        System.out.println("Largest rectangle area: " + largestRectangleArea);
        System.out.println("Largest triangle area: " + largestTriangleArea);
    }

    static Shape findLargestArea(Shape[] shapes) {
        // Implementation to find shape with largest area
        return null;
    }

    static double findLargestCircleArea(Shape[] shapes) {
        // Implementation to find largest area among circles
        return 0.0;
    }

    static double findLargestRectangleArea(Shape[] shapes) {
        // Implementation to find largest area among rectangles
        return 0.0;
    }

    static double findLargestTriangleArea(Shape[] shapes) {
        // Implementation to find largest area among triangles
        return 0.0;
    }
}
