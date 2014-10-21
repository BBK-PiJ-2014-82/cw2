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
        
        double dist1, dist2, dist3;
        
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
        
        dist1 = Math.sqrt((point1.x * point1.x) + (point1.y * point1.y));
        dist2 = Math.sqrt((point2.x * point2.x) + (point2.y * point2.y));
        dist3 = Math.sqrt((point3.x * point3.x) + (point3.y * point3.y));
        
        if(dist1 < dist2){
            if(dist1 < dist3){
                System.out.println("Point 1 is closest.");
            }
            else{
                System.out.println("Point 3 is closest.");
            }
        }
        
        
    }
    
}