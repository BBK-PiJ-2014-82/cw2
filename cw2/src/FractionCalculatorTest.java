public class FractionCalculatorTest {

    public static void main(String[] args) {
        
        FractionCalculator calc = new FractionCalculator();
        
        // test fraction is entered and returned
        Fraction a = new Fraction(1,2);
        Fraction b1 = calc.evaluate(a, "2/3");
        Fraction b2 = calc.evaluate(a, "2/3");
        test(b1, b2, "Fraction pass failed: ", "Fraction pass successful: ");
        
        // test whole number is converted into fraction with denominator 1
        Fraction c1 = calc.evaluate(a, "2/1");
        Fraction c2 = calc.evaluate(a, "2");
        test(c1, c2, "Whole number conversion failed: ", "Whole number conversion successful: ");
        
        // test addition ignoring a
        Fraction d1 = calc.evaluate(a, "1/2 + 1/4 + 1/8");
        Fraction d2 = new Fraction(7, 8);
        test(d1, d2, "Addition failed: ", "Addition successful: ");
        
        // test addition including a
        Fraction e1 = calc.evaluate(a, "+ 1/4 + 1/8");
        Fraction e2 = new Fraction(7, 8);
        test(e1, e2, "Addition incl. passed fraction failed: ", "Addition incl. passed fraction successful: ");
        
        // test subtraction ignoring a
        Fraction f1 = calc.evaluate(a, "1/2 - 1/4");
        Fraction f2 = new Fraction(1, 4);
        test(f1, f2, "Subtraction failed: ", "Subtraction successful: ");
        
        // test subtraction including a
        Fraction g1 = calc.evaluate(a, "- 1/4 - 1/8");
        Fraction g2 = new Fraction(1, 8);
        test(g1, g2, "Subtraction incl. passed fraction failed: ", "Subtraction incl. passed fraction successful: ");
        
        // test multiplication ignoring a
        Fraction h1 = calc.evaluate(a, "1/2 * 1/4");
        Fraction h2 = new Fraction(1, 8);
        test(h1, h2, "Multiplication failed: ", "Multiplication successful: ");
        
        // test multiplication including a
        Fraction i1 = calc.evaluate(a, "* 1/2");
        Fraction i2 = new Fraction(1, 4);
        test(i1, i2, "Multiplication incl. passed fraction failed: ", "Multiplication incl. passed fraction successful: ");
        
        // test division ignoring a
        Fraction j1 = calc.evaluate(a, "1/2 / 3/4");
        Fraction j2 = new Fraction(4, 6);
        test(j1, j2, "Division failed: ", "Division successful: ");
        
        // test multiplication including a
        Fraction k1 = calc.evaluate(a, " / 3/4");
        Fraction k2 = new Fraction(4, 6);
        test(k1, k2, "Division incl. passed fraction failed: ", "Division incl. passed fraction successful: ");
        
        // test fraction without prior operation replaces previous fraction
        Fraction l1 = calc.evaluate(a, " 2/3");
        Fraction l2 = new Fraction(2, 3);
        test(l1, l2, "New fraction replacement failed: ", "New fraction replacement successful: ");
        Fraction l3 = calc.evaluate(a, " + 1/2 1/4");
        Fraction l4 = new Fraction(1, 4);
        test(l3, l4, "New fraction replacement failed: ", "New fraction replacement successful: ");
        Fraction l5 = calc.evaluate(a, " 4");
        Fraction l6 = new Fraction(4, 1);
        test(l5, l6, "New fraction replacement failed: ", "New fraction replacement successful: ");
        
        // test absolute
        Fraction m1 = calc.evaluate(a, "-2/3");
        Fraction m2 = new Fraction (2, 3);
        test(m1, m2, "Absolute failed: ", "Abolute successful: ");
        
    }
    
    static void test(Fraction f1, Fraction f2, String msg1, String msg2){
    	if (!f1.equals(f2)){
            System.out.println(msg1 + f1.toString());
        }
        else{
            System.out.println(msg2 + f1.toString());
        }
    }
}