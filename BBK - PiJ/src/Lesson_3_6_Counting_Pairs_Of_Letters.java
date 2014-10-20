import java.util.Scanner;

public class Lesson_3_6_Counting_Pairs_Of_Letters {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String shortStr, longStr;
        int count = 0;
        int seriesCount = 0;
        
        System.out.print("Please enter a short string: ");
        shortStr = s.nextLine();
        System.out.print("Now please enter a long string: ");
        longStr = s.nextLine();
        
        for(int i = 0; i < longStr.length(); i++){
            if(longStr.charAt(i) == shortStr.charAt(seriesCount)){
                seriesCount++;
                if(seriesCount == shortStr.length()){
                    count++;
                    seriesCount = 0;
                }
            }
        }
        
        System.out.println("The short string appears " + count + " times in the long string.");
        
    }
    
}