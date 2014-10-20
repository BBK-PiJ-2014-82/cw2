import java.util.Scanner;

public class Lesson_3_10_Palindrome_Redux {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String palin, newPalin;
        boolean isPalin = true;
        
        newPalin = "";
        
        System.out.println("Please enter a text that may or may not be a palindrome: ");
        palin = s.nextLine();
        
        for(int j = 0; j < palin.length(); j++){
            if(Character.isLetter(palin.charAt(j))){
                newPalin = newPalin + Character.toLowerCase(palin.charAt(j));
            }
        }
        
        for(int i = 0; i <= newPalin.length()/2; i++){
            if(newPalin.charAt(i) != newPalin.charAt(newPalin.length()-1-i)){
                isPalin = false;
            }
        }
        
        if(isPalin){
            System.out.println("This is a relaxed palindrome.");
        }
        else{
            System.out.println("This is NOT a relaxed palindrome.");
        }
        
    }
    
}