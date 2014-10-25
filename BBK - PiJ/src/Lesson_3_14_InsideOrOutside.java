import java.util.Scanner;

public class Lesson_3_14_InsideOrOutside {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        class Point {
            double x;
            double y;
        }
        
        class Rectangle {
            Point upLeft;
            Point downRight;
        }
        
        Rectangle rect = new Rectangle();
        
        Point point1 = new Point();
        Point point2 = new Point();        
        
        System.out.print("Please enter x coordinate for upper left corner : ");
        point1.x = s.nextDouble();
        System.out.print("Please enter y coordinate for upper left corner : ");
        point1.y = s.nextDouble();
        System.out.print("Please enter x coordinate for lower right corner : ");
        point2.x = s.nextDouble();
        System.out.print("Please enter y coordinate for lower right corner : ");
        point2.y = s.nextDouble();
        System.out.println();
        
        rect.upLeft = point1;
        rect.downRight = point2;
        
        Point point3 = new Point();
        
        System.out.print("Please enter x coordinate for your 3rd point : ");
        point3.x = s.nextDouble();
        System.out.print("Please enter y coordinate for your 3rd point : ");
        point3.y = s.nextDouble();
        
        if((point3.x < rect.upLeft.x && point3.x > rect.downRight.x ||
                point3.x > rect.upLeft.x && point3.x < rect.downRight.x) &&
                (point3.y < rect.upLeft.y && point3.y > rect.downRight.y ||
                point3.y > rect.upLeft.y && point3.y < rect.downRight.y)){
            System.out.println("Your third point is within the rectangle.");
        }
        else{
            System.out.println("Your third point is not within the rectangle.");
        }
            
    }
}