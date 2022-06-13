public class RandomNumbes {
    public static void main(String[] args) {

        System.out.println(Math.random());  //[0,1)

        if (Math.random() <0.5) {
            System.out.println("tails");
        }
        else {
            System.out.println("heads");
        }

        int diceRoll = (int)(Math.random() * 6) + 1;
                // [0,1) * 6 = 0,1,2,3,4,5 + 1 = 1,2,3,4,5,6
        System.out.println("you rolled a " + diceRoll);
        diceRoll = (int)(Math.random() * 6) + 1;
        System.out.println("you rolled a " + diceRoll);
            //100-150 random
        int hundred = (int)(Math.random() * 51) + 100;
        System.out.println(hundred);


    }
}
