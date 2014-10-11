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
        int intRank, intSuit;
        
        boolean[][] deck = new boolean[13][4];
        
        int count = 0;
        
        while (count < 5){
            
            System.out.print("Please enter rank number " + (count+1) + " : ");
            tempRank = s.nextLine();
            
            switch (tempRank){
                case "1":
                    intRank = 0;
                    break;
                case "2":
                    intRank = 1;
                    break;
                case "3":
                    intRank = 2;
                    break;
                case "4":
                    intRank = 3;
                    break;
                case "5":
                    intRank = 4;
                    break;
                case "6":
                    intRank = 5;
                    break;
                case "7":
                    intRank = 6;
                    break;
                case "8":
                    intRank = 7;
                    break;
                case "9":
                    intRank = 8;
                    break;
                case "10":
                    intRank = 9;
                    break;
                case "J":
                    intRank = 10;
                    break;
                case "Q":
                    intRank = 11;
                    break;
                case "K":
                    intRank = 12;
                    break;
                default:
                    System.out.println(tempRank + " is not a valid rank.");
                    continue;
            }
            
            System.out.print("Please enter suit number " + (count+1) + " : ");
            tempSuit = s.nextLine();

            switch (tempSuit){
                case "H":
                    intSuit = 0;
                    break;
                case "S":
                    intSuit = 1;
                    break;
                case "D":
                    intSuit = 2;
                    break;
                case "C":
                    intSuit = 3;
                    break;
                default:
                    System.out.println(tempSuit + "is not a valid suit. Please re-enter your card.");
                    continue;
            }
            
            if(deck[intRank][intSuit] == true){
                System.out.println("That card has already been selected; pick another.");
                continue;
            }
            else{
                deck[intRank][intSuit] = true;
            }
            
            count++;
        }
        
        int suitCount;
        boolean fiveSame = false;
        
        for(int i = 0; i < 4; i++){
            
            suitCount = 0;
            
            for (int j = 0; j < 13; j++){
                if (deck[j][i]){
                    suitCount++;
                }
                
                if(suitCount == 5){
                    fiveSame = true;
                    break;
                }
            }            
        }
        
        boolean countStarted = false;
        boolean lastLineTrue = false;
        boolean consecutive = false;
        
        int countCons = 0;
        
        for(int i = 0; i < 13; i++){
            for(int j = 0; j < 4; j++){
                if(!countStarted && deck[i][j] == true){
                    countStarted = true;
                    lastLineTrue = true;
                    break;
                }
                else if(countStarted && deck[i][j] == true){
                    lastLineTrue = true;
                    break;
                }
                else{
                    lastLineTrue = false;
                }
            }
            if(countStarted && lastLineTrue){
                countCons++;
            }
        }
        
        if(countCons == 5){
            consecutive = true;
        }
        
        int pairCount = 0;
        int trioCount = 0;
        int fourCount = 0;
        int tempCount;
        
        for(int i = 0; i < 13; i++){
            tempCount = 0;
            
            for(int j = 0; j < 4; j++){
                if(deck[i][j]){
                    tempCount++;
                }
            }
            
            if(tempCount == 2){
                pairCount++;
            }
            else if(tempCount == 3){
                trioCount++;
            }
            else if(tempCount == 4){
                fourCount++;
            }
            
        }
        
        
        if(fiveSame && consecutive){
            System.out.println("Straight flush!");
        }
        else if(fourCount == 1){
            System.out.println("Poker!");
        }
        else if(trioCount == 1 && pairCount == 1){
            System.out.println("Full house!");
        }
        else if(fiveSame){
            System.out.println("Flush!");
        }
        else if(consecutive){
            System.out.println("Straight!");
        }
        else if(trioCount == 1){
            System.out.println("Three of a kind!");
        }
        else if(pairCount == 2){
            System.out.println("Two pairs!");
        }
        else if(pairCount == 1){
            System.out.println("Pair!");
        }
        else{
            System.out.println("You got a bum deal!");
        }
        
    }
    
}