public class Q2b {
    public static void main(String[] args) {
        double r = 1; // Radius of the base of a cylinder
        double h = 2; // Height of a cylinder
        displayVolume(r, h); // 1 , 2
        r = 3;
        h = 4;
        displayVolume(r, h);
    }

    public static double area(double r) {
        return 3.14159 * r * r;
    }

    public static void displayVolume(double r, double h) {
        System.out.println("Volume of cylinder having base area " + area(r) +
                " and height " + h + " is " + (h * area(r)) + ".");
    }
}
