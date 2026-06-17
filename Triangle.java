public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String color, boolean filled, double a, double b, double c)
            throws InvalidShapeException {

        super(color, filled);

        if (a <= 0 || b <= 0 || c <= 0)
            throw new InvalidShapeException("Sides must be positive");

        if (a + b <= c || a + c <= b || b + c <= a)
            throw new InvalidShapeException("Triangle inequality violated");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void resize(double factor) throws InvalidShapeException {
        if (factor <= 0)
            throw new InvalidShapeException("Invalid factor");

        a *= factor;
        b *= factor;
        c *= factor;
    }
}