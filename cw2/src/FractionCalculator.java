import java.util.Scanner;

public class FractionCalculator {

    public FractionCalculator(){}
    
    public Fraction evaluate(Fraction fraction, String inputString) {
        
        // create variables
        char operator;
        Fraction current = fraction;
        String item;
        
        // create Scanner
        Scanner s1 = new Scanner(inputString);
        
        // parse the string and perform calculations
        while(s1.hasNext()){
            item = s1.next();
            
            // parse numerals
            if(Character.isDigit(item.charAt(0))){
                // create variables
                int num, denom;
                
                // create Scanner
                Scanner s2 = new Scanner(item);
                s2.useDelimiter("/");
                
                num = s2.nextInt();
                
                if(s2.hasNext()){
                    denom = s2.nextInt();
                    current = new Fraction(num, denom);
                }
                else{
                    current = new Fraction(num, 1);
                }
                
            }
        }
        
        return current;
    }
    
}