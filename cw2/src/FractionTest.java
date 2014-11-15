/**
 * Created by keith for the second coursework assignment.
 */
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
	Fraction f = new Fraction(3,10);
	Fraction g = new Fraction(1,2);
	Fraction h = new Fraction(3,5);
	if (!f.equals(g.multiply(h))) System.out.println("Multiply failed");
        // test equals
	test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
	test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
	test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
	test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
	test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");

        // extend with extra tests
        
        // test add
        Fraction i = new Fraction(19,15);
        Fraction j = new Fraction(3,5);
        Fraction k = new Fraction(2,3);
        if(!i.equals(j.add(k))) System.out.println("Add failed");
        
        // test subtract
        Fraction l = new Fraction(1,6);
        Fraction m = new Fraction(2,3);
        Fraction n = new Fraction(1,2);
        if(!l.equals(m.subtract(n))) System.out.println("Sub failed");
        
        // test divide
        Fraction o = new Fraction(6,2);
        Fraction p = new Fraction(1,2);
        Fraction q = new Fraction(1,6);
        if(!o.equals(p.divide(q))) System.out.println("Divide failed");
        
    }

    static void test(Fraction f1, Fraction f2, String msg){
    	if (! f1.equals(f2))
		System.out.println(msg);
    }
}
