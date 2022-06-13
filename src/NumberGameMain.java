import java.util.Scanner;
public class NumberGameMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("try to guess the number 1-150 in as few guesses as possible");
        System.out.println("enter a negative number to quit");
        System.out.println("start guessing");
        boolean a = false;

        NumberGame guesses = new NumberGame((int)(Math.random()*100)+1 ,0);
        int g = 5000;
        while (g >= 0) {
            g = in.nextInt();
            guesses.Guess(g);
        }

    }
}
