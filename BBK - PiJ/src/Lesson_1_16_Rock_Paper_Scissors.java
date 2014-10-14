import java.util.Scanner;

public class Lesson_1_16_Rock_Paper_Scissors {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int player1Score = 0;
        int player2Score = 0;
        
        char play1, play2;
        
        int difference = Math.abs(player1Score - player2Score);
        
        String result;
        
        System.out.println("Enter the result of a rock, scissor, paper game.");
        System.out.println("Enter 2 characters only.");
        System.out.println("'P' is Paper.");
        System.out.println("'S' is Scissors.");
        System.out.println("'R' is Rock.");
        System.out.println("Here's an example: PR - Paper & Rock.");
        
        while(difference < 4){
            
            System.out.print("Enter the result: ");
            
            result = s.nextLine();
            
            if (result.length() > 2){
                System.out.println("That is not a valid result.  Please try again.");
                continue;
            }
            
            play1 = result.charAt(0);
            play2 = result.charAt(1);
            
            if((play1 == 'P' || play1 == 'S' || play1 == 'R') &&
                (play2 == 'P' || play2 == 'S' || play2 == 'R')){
                
                switch(result){
                    case "PP":
                        System.out.println("Draw.");
                        break;
                    case "PS":
                        System.out.println("Player 2 wins!");
                        player2Score++;
                        break;
                    case "PR":
                        System.out.println("Player 1 wins!");
                        player1Score++;
                        break;
                    case "SP":
                        System.out.println("Player 1 wins!");
                        player1Score++;
                        break;
                    case "SS":
                        System.out.println("Draw.");
                        break;
                    case "SR":
                        System.out.println("Player 2 wins!");
                        player2Score++;
                        break;
                    case "RP":
                        System.out.println("Player 2 wins!");
                        player2Score++;
                        break;
                    case "RS":
                        System.out.println("Player 1 wins");
                        player1Score++;
                        break;
                    case "RR":
                        System.out.println("Draw.");
                        break;
                }
                
                System.out.println("The score is now:");
                System.out.println("Player 1 : " + player1Score + " - Player 2 : " + player2Score);
                System.out.println("Next game.");
                
            }
            else{
                System.out.println("That is not a valid result.  Please try again.");
            }
            
            difference = Math.abs(player1Score - player2Score);
            
        }
        
        if(player1Score - player2Score == 4){
            System.out.println("Player 1 is the winner!");
        }
        else{
            System.out.println("Player 2 is the winner!");
        }
        
    }
    
}