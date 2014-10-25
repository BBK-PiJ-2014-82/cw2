import java.util.Scanner;

public class Lesson_3_15_Overlap {

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
        
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        Point point4 = new Point();
        
        Boolean inRect1 = false;
        Boolean inRect2 = false;
        
        System.out.print("Please enter x coordinate for upper left corner of 1st rectangle : ");
        point1.x = s.nextDouble();
        System.out.print("Please enter y coordinate for upper left corner of 1st rectangle : ");
        point1.y = s.nextDouble();
        System.out.print("Please enter x coordinate for lower right corner of 1st rectangle : ");
        point2.x = s.nextDouble();
        System.out.print("Please enter y coordinate for lower right corner of 1st rectangle : ");
        point2.y = s.nextDouble();
        System.out.println();
        
        rect1.upLeft = point1;
        rect1.downRight = point2;
        
        System.out.print("Please enter x coordinate for upper left corner of 2nd rectangle : ");
        point3.x = s.nextDouble();
        System.out.print("Please enter y coordinate for upper left corner of 2nd rectangle : ");
        point3.y = s.nextDouble();
        System.out.print("Please enter x coordinate for lower right corner of 2nd rectangle : ");
        point4.x = s.nextDouble();
        System.out.print("Please enter y coordinate for lower right corner of 2nd rectangle : ");
        point4.y = s.nextDouble();
        System.out.println();
        
        rect2.upLeft = point3;
        rect2.downRight = point4;
                
        Point point5 = new Point();
        
        System.out.print("Please enter x coordinate for your 3rd point : ");
        point5.x = s.nextDouble();
        System.out.print("Please enter y coordinate for your 3rd point : ");
        point5.y = s.nextDouble();
        
        if((point5.x < rect1.upLeft.x && point5.x > rect1.downRight.x ||
                point5.x > rect1.upLeft.x && point5.x < rect1.downRight.x) &&
                (point5.y < rect1.upLeft.y && point5.y > rect1.downRight.y ||
                point5.y > rect1.upLeft.y && point5.y < rect1.downRight.y)){
            inRect1 = true;
        }
            
        if((point5.x < rect2.upLeft.x && point5.x > rect2.downRight.x ||
            point5.x > rect2.upLeft.x && point5.x < rect2.downRight.x) &&
            (point5.y < rect2.upLeft.y && point5.y > rect2.downRight.y ||
            point5.y > rect2.upLeft.y && point5.y < rect2.downRight.y)){
            inRect2 = true;
        }
        
        if(inRect1 && inRect2){
            System.out.println("Your final point is inside both rectangles.");
        }
        else if(inRect1){
            System.out.println("Your final point is within your 1st rectangle.");
        }
        else if(inRect2){
            System.out.println("Your final point is within your 2nd rectangle.");
        }
        else{
            System.out.println("Your final point is outside of both triangles.");
        }
        
    }
}