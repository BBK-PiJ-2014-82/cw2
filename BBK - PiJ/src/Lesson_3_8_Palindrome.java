import java.util.Scanner;

public class Lesson_3_8_Palindrome {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String palin;
        boolean isPalin = true;
        
        System.out.println("Please enter a text that may or may not be a palindrome: ");
        palin = s.nextLine();
        
        for(int i = 0; i <= palin.length()/2; i++){
            if(palin.charAt(i) != palin.charAt(palin.length()-1-i)){
                isPalin = false;
            }
        }
        
        if(isPalin){
            System.out.println("This is a true palindrome.");
        }
        else{
            System.out.println("This is NOT a true palindrome.");
        }
        
    }
    
}