import java.util.Scanner;

public class Lesson_1_15_Guess_My_Number {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
               
        int numberToGuess = (int)Math.abs(1000 * Math.random());
        int guessNumber;
        int guesses = 1;
        boolean guessed = false;
        
        System.out.print("Try to guess my number (integers between 1 and 1000 inclusive): ");
        
        while(!guessed){
            
            guessNumber = s.nextInt();
            
            if(guessNumber < 1 || guessNumber > 1000){
                System.out.print("You need to guess between 1 and 1000. Try again: ");
                continue;
            }
            else if(guessNumber > numberToGuess){
                System.out.print("No, my number is lower than that. Guess again: ");
            }
            else if(guessNumber < numberToGuess){
                System.out.print("No, my number is higher than that. Guess again: ");
            }
            else{
                System.out.println("CORRECT!");
                System.out.println("You needed " + guesses + " guesses.");
                guessed = true;
            }
            
            guesses++;
        }
        
    }
    
}