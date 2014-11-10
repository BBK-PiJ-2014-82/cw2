import java.util.Scanner;

public class Lesson_5_2_1_Factorial_Iterative {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer here: ");
        int yourInt = s.nextInt();
        int factorial = 1;
        
        for(int i = 1; i < yourInt; i++){
            factorial += factorial * i;
        }
        
        System.out.println(factorial);
        
    }

}