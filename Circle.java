public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) throws InvalidShapeException {
        super(color, filled);
        if (radius <= 0) throw new InvalidShapeException("Invalid radius");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void resize(double factor) throws InvalidShapeException {
        if (factor <= 0) throw new InvalidShapeException("Invalid factor");
        radius *= factor;
    }
}