package house;

class MyPoint {
    int x;
    int y;
}

// class Circle extends MyPoint{ // 상속
// int r;
// }

class Circle {
    MyPoint p = new MyPoint();
    int r;
}

public class Home15 {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.p.x =" + c.p.x);
        System.out.println("c.p.y =" + c.p.y);
        System.out.println("c.r =" + c.r);

    }
}
