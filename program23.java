
class circle {
    private float radius;

    public void setRadius(float x) {
        radius = x;
    }

    public float getRadius() {
        return radius;
    }

    public float area() {
        return (3.14f * radius * radius);
    }

    public float circumference() {
        return (2 * 3.14f * radius);
    }
}

public class program23 {
    public static void main(String[] args) {
        System.out.println("\n");
        circle abc = new circle();

        abc.setRadius(12.5f);
        System.out.println("the radius is "+ abc.getRadius());

        System.out.println("area of the circle is "+ abc.area());
        System.out.println("circumference of the circle is "+ abc.circumference());

    }
}
