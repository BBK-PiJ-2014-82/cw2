import java.util.Scanner;

public class Lesson_1_16_Rock_Paper_Scissors {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int player1Score = 0;
        int player2Score = 0;
        
        String result;
        
        System.out.println("Enter the result of a rock, scissor, paper game.");
        System.out.println("Enter 2 characters only.");
        System.out.println("'P' is Paper.");
        System.out.println("'S' is Scissors.");
        System.out.println("'R' is Rock.");
        System.out.println("Here's an example: PR - Paper & Rock.");
        
        while(player1Score < 4 || player2Score < 4){
            
            result = s.nextLine();
            
            if (result.length() > 2){
                System.out.print("That is not a valid result.  Please try again: ");
                continue;
            }
            
            
            
        }
        
    }
    
}