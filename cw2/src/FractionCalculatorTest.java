public class FractionCalculatorTest {

    public static void main(String[] args) {
        
        FractionCalculator calc = new FractionCalculator();
        
        // test fraction is entered and returned
        Fraction a = new Fraction(1,2);
        Fraction b = calc.evaluate(a, "2,3");
        System.out.println(b.toString());
        
    }

}