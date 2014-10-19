import java.util.Scanner;

public class Lesson_3_5_Counting_Letters {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String sentence1, sentence2;
        char letter;
        int count = 0;
        
        System.out.println("Please enter a sentence below:");      
        sentence1 = s.nextLine();
        System.out.println("Now please also enter a letter you would like to count in this sentence:");
        sentence2 = s.nextLine();
        
        if(sentence2.length() > 1){
            System.out.println("Sorry, you can only enter 1 character for the letter.");
            return;
        }
        
        sentence1 = sentence1.toLowerCase();
        sentence2 = sentence2.toLowerCase();
        letter = sentence2.charAt(0);
        
        for(int i = 0; i < sentence1.length(); i++){
            if(sentence1.charAt(i) == letter){
                count++;
            }
        }
        
        if(count > 0){
            System.out.println("Letter '" + letter + "' appeared " + count + " times in your sentence.");
        }
        
    }
    
}