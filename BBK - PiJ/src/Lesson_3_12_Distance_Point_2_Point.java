import java.util.Scanner;

public class Lesson_3_12_Distance_Point_2_Point {

    public static void main(String[] args) {
        
        class Point {
            double x;
            double y;
        }
        
        Scanner s = new Scanner(System.in);
        String input;
        
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        
        System.out.println("Please enter x coordinate number 1 : ");
        point1.x = s.nextDouble();
        System.out.println("Please enter y coordinate number 1 : ");
        point1.y = s.nextDouble();
        System.out.println("Please enter x coordinate number 2 : ");
        point2.x = s.nextDouble();
        System.out.println("Please enter y coordinate number 2 : ");
        point2.y = s.nextDouble();
        System.out.println("Please enter x coordinate number 3 : ");
        point3.x = s.nextDouble();
        System.out.println("Please enter y coordinate number 3 : ");
        point3.y = s.nextDouble();
        
        
        
    }
    
}