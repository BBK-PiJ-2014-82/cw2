import java.util.Scanner;

public class Lesson_1_18_PIE {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("We are going to calculate Pie using the Leibniz formula.");
        System.out.print("How many terms do you wish to use? ");
        
        int termsCount = s.nextInt();
        int termsSoFar = 1;
        
        double divider = 3;
        
        double pie = 4 / 1;
        
        while(termsSoFar < termsCount){
            if(termsSoFar%2 == 1){
                pie -= (4 / divider);
            }
            else{
                pie += (4 / divider);
            }
            termsSoFar++;
            divider += 2;
        }
        
        System.out.println(pie);
        
    }
    
}