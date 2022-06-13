public class QuadMain {
    public static void main(String[] args) {

        Quadratics func = new Quadratics (5,6,-1);
        System.out.println(func.getNumSoluions());

        func.printRoots();
    }
}
