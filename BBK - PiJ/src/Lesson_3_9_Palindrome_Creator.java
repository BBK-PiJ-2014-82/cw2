import java.util.Scanner;

public class Lesson_3_9_Palindrome_Creator {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String text;
        
        System.out.println("Please enter a text to transform into a palindrome: ");
        text = s.nextLine();
        System.out.println("Your palindrome is:");
        System.out.println();
        
        System.out.print(text);
        for(int i = text.length()-1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        
        System.out.println();
        System.out.println();
    }
    
}