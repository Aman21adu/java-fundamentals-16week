public class ShapeInterfaceDemo {
    public static void main(String[] args) {
        Measurable[] shapes = new Measurable[2];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Circle(5);

        System.out.println("Rectangle: area = " +
            String.format("%.2f", shapes[0].getArea()) +
            ", perimeter = " +
            String.format("%.2f", shapes[0].getPerimeter()));

        System.out.println("Circle: area = " +
            String.format("%.2f", shapes[1].getArea()) +
            ", perimeter = " +
            String.format("%.2f", shapes[1].getPerimeter()));
    }
}

interface Measurable {
    double getArea();
    double getPerimeter();
}

class Rectangle implements Measurable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
