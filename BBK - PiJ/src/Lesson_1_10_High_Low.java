import java.util.Scanner;

public class Lesson_1_10_High_Low {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str;
        
        int temp = 0;
        int last = -1;
        int count = 0;
        
        Boolean ascending = false;
        Boolean descending = false;
        
        System.out.println("Please enter a string of positve integers.");
        System.out.println("Please enter '-1' to end and find whether your list was consecutive.");
        System.out.print("Please enter your first number: ");
        
        while(true){
            
            str = s.nextLine();
            temp = Integer.parseInt(str);
            
            if(temp == -1){
                break;
            }
            
            if(temp < -1 || temp == 0){
                System.out.print("Please enter positive numbers only: ");
                continue;
            }
            
            if (count == 1){
                
                if (temp - last == 1){
                    ascending = true;
                }
                else if (temp - last == -1){
                    descending = true;
                }
                else{
                   ascending = false;
                   descending = false;
                }
            }
            else if (ascending) {
                if (temp - last != 1){
                    ascending = false;
                }
            }
            else if (descending){
                if (temp - last != -1){
                    descending = false;
                }
            }
            
            last = temp;
            count++;
            System.out.print("Next number: ");
        }
        
        if(count == 0){
            System.out.println("You didn't add any numbers.");
        }
        else{
            System.out.println((ascending || descending) ? "Yes" : "No");
        }
    }
}