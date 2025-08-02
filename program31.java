
class rectangle {
    int length;
    int breadth;

    rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
        System.out.println("the rectangle(base) class ");
    }

    public int area(int l, int b) {
        this.length = l;
        this.breadth = b;
        return length * breadth;
    }

}

class cuboid extends rectangle {
    int height;

    cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
        System.out.println("the cuboid(derived) class ");
    }
    public int volume(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
        return length * breadth * height;
    }

}

public class program31 {

    public static void main(String[] args) {

        System.out.println("\n");
        cuboid c = new cuboid(1, 2, 3);
        System.out.println(c.area(1, 2));
        System.out.println(c.volume(1, 2, 3));

    }
}
