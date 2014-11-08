public class Lesson_4_6_MoreOnPoints {

    public static void main(String[] args) {
        
        Point pnt1 = new Point(5,0);
        Point pnt2 = new Point(1,0);
        Point pnt3;
        
        System.out.println("The distance between the points is " + pnt1.distanceTo(pnt2));
        System.out.println("The distance of point 1 from the origin is " + pnt1.distanceToOrigin());
        pnt1.moveTo(-10,0);
        pnt2.moveTo(pnt1);
        System.out.println("The distance of point 2 from the origin is " + pnt2.distanceToOrigin());
        System.out.println("The distance between the points is " + pnt1.distanceTo(pnt2));
        pnt3 = pnt1.clone();
        pnt3.opposite();
        System.out.println("The distance of point 3 from the origin is " + pnt3.distanceToOrigin());
        System.out.println("The distance between the points is " + pnt3.distanceTo(pnt2));
        
    }
}
    
class Point{

    double x, y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    double distanceTo(Point a){
        double newx, newy, dist;
        newx = this.x + a.x;
        newy = this.y - a.y;
        dist = Math.sqrt((newx * newx) + (newy * newy));
        return dist;
    }

    double distanceToOrigin(){
        Point newPnt = new Point(0,0);
        return distanceTo(newPnt);
    }

    void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    void moveTo(Point a){
        this.x = a.x;
        this.y = a.y;
    }

    public Point clone(){
        Point pnt = new Point(this.x, this.y);
        return pnt;
    }

    void opposite(){
        Point pnt4 = new Point(this.x*-1, this.y*-1);
    }
}