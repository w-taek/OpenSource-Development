class MyPoint {
    private int x, y;
    public MyPoint(int x, int y) { this.x = x; this.y = y; }

    @Override
    public String toString() {
        return "Point(" + this.x + "," + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        MyPoint p = (MyPoint) obj;
        return (this.x == p.x && this.y == p.y);
    }
}

public class Lab06Ex01 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if (p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");
    }
}
