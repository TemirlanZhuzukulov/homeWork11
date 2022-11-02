public class Triangle {
    double a;
    double b;
    double c;

    public void counter(double a, double b, double c) {
        double area = 0;
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
}
