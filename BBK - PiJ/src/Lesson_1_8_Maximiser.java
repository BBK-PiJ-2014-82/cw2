import java.util.Scanner;

public class Lesson_1_8_Maximiser {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str;
        int temp = 0;
        int max = 0;
        
        System.out.println("Please enter a string of positve integers.");
        System.out.println("Please enter '-1' to end and find the maximum number you entered.");
        System.out.print("Please enter your first number: ");
        
        while(true){
            str = s.nextLine();
            temp = Integer.parseInt(str);
            
            if(temp == -1){
                break;
            }
            
            if(temp > max){
                max = temp;
            }
            
            System.out.print("Next number: ");
        }
        
        System.out.println("Your maximum number was " + max);
        
    }
    
}