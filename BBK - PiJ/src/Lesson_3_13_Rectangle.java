import java.util.Scanner;

public class Lesson_3_13_Rectangle {

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
        
        double perimeter = 2 * (Math.abs(rect.upLeft.x - rect.downRight.x) + Math.abs(rect.upLeft.y - rect.downRight.y));
        double area = (Math.abs(rect.upLeft.x - rect.downRight.x) * Math.abs(rect.upLeft.y - rect.downRight.y));
        
        System.out.println("The rectangles perimeter length is : " + perimeter);
        System.out.println("The rectangles area is : " + area);
        
    }
    
}