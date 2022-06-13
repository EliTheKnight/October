public class NumberGame {

    private int goal, numGuesses;

    public NumberGame(int goal, int numGuesses) {
        this.goal = goal;
        this.numGuesses = numGuesses;
    }

    public void Guess(int b){
        if(b < goal) {
            System.out.println("higher");
            numGuesses ++;
        }
        else if (b > goal) {
            System.out.println("lower");
            numGuesses ++;
        }
        else{
            numGuesses ++;
            System.out.println("you guessed the right number in " + numGuesses);
            numGuesses = 0;
            goal = (int)(Math.random()*100)+1;
            System.out.println("Can you guess this number?");
        }

    }


}
