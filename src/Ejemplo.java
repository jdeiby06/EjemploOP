
import java.util.ArrayList;
import java.util.List;

// 1. Se define una interfaz que sirve de conexion con las clases circulo y rectangulo
interface Shape {
    double calculateArea();
}

// 2. Se crean las implementaciones
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 3. Se actualiza la clase AreaCalculator
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
