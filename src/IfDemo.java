public class IfDemo {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 10;

        if(a < b){
            System.out.println("a is less than b");
        }
        else if(a > b) {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is equal to b");
        }
        // how to make boolean expressions...
        // numerical comparisons:  <  >  ==  !=  <=  >=
        // Common error: = vs ==, assignment vs equality

        //check if a number, c, is even.
        if(c % 2 == 0) {
            System.out.println("c is even");
        }
        else {
            System.out.println("c is odd");
        }

        //check if a is less than 10 and odd:
        if (a < 10) {
            if (a % 2 != 0) {
                System.out.println("a is odd");
            }
        }

        //combine boolean expressions! and &&   or ||   not !
        if (a < 10 && a % 2 == 0){

        }

        if (a < 10 || a % 2 == 0){

        }

        //if b is negative or b > a
        if(b < 0 || b > a) {

        }

        //if a is not less than b
        if(!(a < b)) {

        }


    }
}
