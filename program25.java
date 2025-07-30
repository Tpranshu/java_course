
class cylinder {
    private int height;
    private int radius;

    public cylinder(int x, int y){
        radius = x;
        height = y;
    }

    void setRadius(int x) {
        radius = x;
    }

    int getRadius() {
        return radius;
    }

    void setHeight(int x) {
        height = x;
    }

    int getHeight() {
        return height;
    }

    // public float area(float a, float b) {
    // radius = a;
    // height = b;
    // return 2 * 3.14f * radius * (radius + height);
    // }

    public double SurfaceArea() {

        return (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
    }
}

public class program25 {
    public static void main(String[] args) {
        cylinder pranshu = new cylinder(5,10);
        System.out.println("\n");
        // pranshu.setRadius(5);
        System.out.println(pranshu.getRadius());
        // pranshu.setHeight(10);
        System.out.println(pranshu.getHeight());

        // System.out.println(pranshu.area(5.0f,10.0f));
        System.out.println(pranshu.SurfaceArea());

    }
}
