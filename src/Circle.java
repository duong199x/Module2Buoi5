public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    public static int numberRadius;
    public static double maxRadius;
    public static double sumS;

    public Circle(double Radius) {
        this.radius = Radius;
        this.id = ++numberRadius;
        if (maxRadius < Radius) {
            maxRadius = Radius;
        }
        sumS += dienTich();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", radius=" + radius +
                '}';
    }

    public double dienTich() {
        return this.radius * this.radius * PI;
    }

    public double chuVi() {
        return this.radius * 2 * PI;
    }
    public double getRadius(){
        return this.radius;
    }

}

class Main2 {
    public static void main(String[] args) {
        Circle ht1 = new Circle(2);
        Circle ht2 = new Circle(4);
        Circle ht3 = new Circle(6);
        System.out.println(ht1);
        System.out.println(ht2);
        System.out.println(ht3);
        System.out.println("Số lượng hình tròn: " + Circle.numberRadius);
        System.out.println("hình tròn có bán kính lớn nhất:" + Circle.maxRadius);
        System.out.println("tổng diện tích:" + Circle.sumS);
    }
}
