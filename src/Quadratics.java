public class Quadratics {

    //y = ax^2 + bx + c
    private double a, b, c;

    //constructor
    public Quadratics(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //methods
    public int getNumSoluions() {
        double discrimnant = (b * b) - (4 * a * c); //Math.pow(b,2)
        if (discrimnant > 0) {
            return 2;
        } else if (discrimnant < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //double getRoot1()  -b + ...
    public double getRoot1() {
        double root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }

    //double getRoot2()   -b - ...
    public double getRoot2() {
        double root = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }

    // x = 1 and x = 3
    // x = 0
    // no roots.
    public void printRoots() {
        if (getNumSoluions() == 2) {
            System.out.println("x = " + getRoot1() + " and " + getRoot2());
        } else if (getNumSoluions() == 1) {
            System.out.println("x = " + getRoot1());
        } else {
            System.out.println("No roots");
        }

    }




}
