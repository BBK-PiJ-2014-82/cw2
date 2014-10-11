import java.util.Scanner;

public class Lesson_1_9_Going_Up {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str;
        int temp = 0;
        int last = -1;
        Boolean consecutive = true;
        
        System.out.println("Please enter a string of positve integers.");
        System.out.println("Please enter '-1' to end and find whether your list was consecutve and increasing.");
        System.out.print("Please enter your first number: ");
        
        while(true){
            
            str = s.nextLine();
            temp = Integer.parseInt(str);
            
            if(temp == -1){
                break;
            }
            
            if(temp < -1){
                System.out.print("Please enter positive numbers only: ");
                return;
            }
            
            if(last == -1){
                System.out.print("Next number: ");
                last = temp;
                continue;
            }
            
            if(temp - last != 1){
                consecutive = false;
            }
            
            last = temp;
            System.out.print("Next number: ");
        }
        
        if(last == -1){
            System.out.println("You didn't add any numbers.");
        }
        else{
            System.out.println(consecutive ? "Yes" : "No");
        }
    }
}