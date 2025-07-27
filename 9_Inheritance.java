
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaya
 */
class Shape {
    int a, r, h;
    Scanner sc = new Scanner(System.in);
}

class TwoDimension extends Shape {
    void area() throws IOException {
        // placeholder
    }
}

class ThreeDimension extends Shape {
    void vol() throws IOException {
        // placeholder
    }
}

class Circle extends TwoDimension {
    void area() throws IOException {
        System.out.println("Enter the radius:");
        r = sc.nextInt();
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Square extends TwoDimension {
    void area() throws IOException {
        System.out.println("Enter side a:");
        a = sc.nextInt();
        System.out.println("Area of Square: " + (a * a));
    }
}

class Triangle extends TwoDimension {
    void area() throws IOException {
        int b;
        System.out.println("Enter base b:");
        b = sc.nextInt();
        System.out.println("Enter height h:");
        h = sc.nextInt();
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

class Sphere extends ThreeDimension {
    void vol() throws IOException {
        System.out.println("Enter radius r:");
        r = sc.nextInt();
        System.out.println("Volume of Sphere: " + (1.333 * 3.14 * r * r * r));
    }
}

class Cube extends ThreeDimension {
    void vol() throws IOException {
        System.out.println("Enter side a:");
        a = sc.nextInt();
        System.out.println("Volume of Cube: " + (a * a * a));
    }
}
public class InheritanceDemo {
    public static void main(String[] args) throws IOException {
        Circle cr = new Circle();
        Square sq = new Square();
        Triangle t = new Triangle();
        Sphere s = new Sphere();
        Cube c = new Cube();

        System.out.println("\n--- 2D Shapes ---");
        cr.area();
        sq.area();
        t.area();

        System.out.println("\n--- 3D Shapes ---");
        s.vol();
        c.vol();
    }
    
}


output 



--- 2D Shapes ---
Enter the radius:
4
Area of Circle: 50.24
Enter side a:
4
Area of Square: 16
Enter base b:
4
Enter height h:
2
Area of Triangle: 4.0

--- 3D Shapes ---
Enter radius r:
4
Volume of Sphere: 267.87968
Enter side a:
4
Volume of Cube: 64