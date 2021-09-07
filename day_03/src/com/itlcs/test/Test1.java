package com.itlcs.test;

/**
 * @author jssqlcs
 * @create 2021/8/29 1:11
 */
public class Test1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        method(circle);
        System.out.println(circle.hashCode());
    }

    static void method(Shape shape) {
        shape.draw();
        shape.erase();
        System.out.println(shape.hashCode());
    }
}

class Shape {
    public void draw() {}
    public void erase() {}

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("draw circle");
    }
    public void erase() {
        System.out.println("erase circle");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("draw square");
    }
    public void erase() {
        System.out.println("erase square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("draw triangle");
    }
    public void erase() {
        System.out.println("erase triangle");
    }
}
