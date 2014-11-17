public class FractionCalculatorTest {

    public static void main(String[] args) {
        
        FractionCalculator calc = new FractionCalculator();
        
        // test fraction is entered and returned
        Fraction a = new Fraction(1,2);
        Fraction b1 = calc.evaluate(a, "2/3");
        Fraction b2 = calc.evaluate(a, "2/3");
        test(b1, b2, "Fraction pass not successful: ", "Fraction pass successfull: ");
        
        // test whole number is converted into fraction with denominator 1
        Fraction c = calc.evaluate(a, "2/1");
        Fraction d = calc.evaluate(a, "2");
        test(c, d, "Whole number conversion failed: ", "Whole number conversion successful: ");
        
        // test addition
        //Fraction c = calc.evaluate(a, "+ 2/4");
        //System.out.println("Fraction c is equal to " + c);
        
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