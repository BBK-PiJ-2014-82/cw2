import java.util.Scanner;

public class Lesson_3_7_Counting_Letters_Redux {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String text, letter;
        String used = "";
        int count = 0;
        boolean charUsed = false;
        
        System.out.print("Please write a text: ");
        text = scan.nextLine();
        
        while(!charUsed){
            System.out.print("Which letter would you like to count now? ");
            letter = scan.nextLine();
            
            if(letter.length() > 1){
                System.out.println("Please type a single letter.");
                continue;
            }
            
            for(int i = 0; i < used.length(); i++){
                if(used.charAt(i) == letter.charAt(0)){
                    charUsed = true;
                }
            }
            
            used = used + letter;
            
            if(!charUsed){
                for(int i = 0; i < text.length(); i++){
                    if(text.charAt(i) == letter.charAt(0)){
                        count++;
                    }
                }

                System.out.println("Letter '" + letter + "' appears " + count + " times in your program.");
                count = 0;
            }
        }
        
        System.out.println("Repeated character. Exiting the program . . .");
        System.out.println("Thank you for your coooperation.  Goodbye . . .");
        
    }
    
}