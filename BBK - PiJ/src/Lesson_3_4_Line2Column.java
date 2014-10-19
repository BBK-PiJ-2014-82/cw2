import java.util.Scanner;

public class Lesson_3_4_Line2Column {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String sentence;
        
        System.out.println("Please enter a sentence below:");
        
        sentence = s.nextLine();
        
        for(int i = 0; i < sentence.length(); i++){
            if(Character.isSpaceChar(sentence.charAt(i))){
                System.out.println();
            }
            else{
                System.out.print(sentence.charAt(i));
            }
        }
        
    }
    
}