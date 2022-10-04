class Shape {
    public Shape next;
    public Shape() { next = null; }
    public void draw() { System.out.println("Shape");
    } }
class Line extends Shape {
    public void draw() {
        System.out.println("Line"); }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect"); }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle"); }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. // 동적 바인딩
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}