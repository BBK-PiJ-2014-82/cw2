import java.util.Scanner;

public class Lesson1_11_Poker_Hands {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter 5 cards.");
        System.out.println("You will be asked to enter the rank and suit separately.");
        System.out.println("The rank must be 1 - 10 or J for Jack, Q for Queen, K for King.");
        System.out.println("The suit must be H for Hearts, S for Spades, C for Clubs, D for Diamonds.");
        System.out.println("Please proceed:");
        System.out.println();
        
        String tempRank, tempSuit;
        int intRank;
        int rank1, rank2, rank3, rank4, rank5;
        
        int Hcount = 0;
        int Dcount = 0;
        int Scount = 0;
        int Ccount = 0;
        
        char suit1 = ' ';
        char suit2 = ' ';
        char suit3 = ' ';
        char suit4 = ' ';
        char suit5 = ' ';
        
        int count = 0;
        
        while (count < 5){
            
            System.out.println("Please enter rank number " + count+1 + " : ");
            tempRank = s.nextLine();
            
            switch (tempRank){
                case "1":
                    intRank = 1;
                    break;
                case "2":
                    intRank = 2;
                    break;
                case "3":
                    intRank = 3;
                    break;
                case "4":
                    intRank = 4;
                    break;
                case "5":
                    intRank = 5;
                    break;
                case "6":
                    intRank = 6;
                    break;
                case "7":
                    intRank = 7;
                    break;
                case "8":
                    intRank = 8;
                    break;
                case "9":
                    intRank = 9;
                    break;
                case "10":
                    intRank = 10;
                    break;
                case "J":
                    intRank = 11;
                    break;
                case "Q":
                    intRank = 12;
                    break;
                case "K":
                    intRank = 13;
                    break;
                default:
                    System.out.println(tempRank + " is not a valid rank.");
                    continue;
            }
            
            System.out.println("Please enter suit number " + count+1 + " : ");
            tempSuit = s.nextLine();

            switch (tempSuit){
                case "H":
                    Hcount++;
                    break;
                case "S":
                    Scount++;
                    break;
                case "D":
                    Dcount++;
                    break;
                case "C":
                    Ccount++;
                    break;
                default:
                    System.out.println(tempSuit + "is not a valid suit. Please re-enter your card.");
                    continue;
            }
            
            switch(count+1){
                case 1:
                    rank1 = intRank;
                    suit1 = tempSuit.charAt(0);
                case 2:
                    rank2 = intRank;
                    suit2 = tempSuit.charAt(0);
                case 3:
                    rank3 = intRank;
                    suit3 = tempSuit.charAt(0);
                case 4:
                    rank4 = intRank;
                    suit4 = tempSuit.charAt(0);
                case 5:
                    rank5 = intRank;
                    suit5 = tempSuit.charAt(0);
            }
            
            count++;
            
        }
        
        if(Dcount == 5 || Ccount == 5 || Scount == 5 || Hcount == 5){
            
        }
        else if(){
            System.out.println("Poker!");
        }
        else if(){
            System.out.println("Full house!");
        }
        
    }
    
}