import java.util.Scanner;

public class FractionCalculator {
    
    public FractionCalculator(){}
    
    public static void main(String[] args) {
        FractionCalculator calculator = new FractionCalculator();
        calculator.launch();
    }
    
    private void launch(){
        
        // variables
        String input = "";
        Fraction value = new Fraction(1,1);
        
        // create Scanner
        Scanner scan = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to James Hills' Fraction Calculator.");
        System.out.println("Please enter a calculation below:");
        
        // obtain input
        input = scan.nextLine();
        
        do  {
            
            value = evaluate(value, input);
            System.out.println(" = " + value.toString());
            input = scan.nextLine();
            
            } while (!input.equalsIgnoreCase("Goodbye"));
        
        System.out.println();
        System.out.println("Fraction Calculator now closing.");
    }
    
    public Fraction evaluate(Fraction fraction, String inputString) {
        
        // create variables
        char operator;
        Fraction current = fraction;
        String item;
        
        // create Scanner
        Scanner s1 = new Scanner(inputString);
        
        //String str = System.console().readLine();
        
        // parse the string and perform calculations
        while(s1.hasNext()){
            item = s1.next();
            
            // parse numerals
            if(Character.isDigit(item.charAt(0))){
                current = parseNumerals(item);
            }
            else{
                switch(item){
                    case "+": operator = item.charAt(0);
                }
            }
        }
        
        return current;
    }
    
    private Fraction parseNumerals(String item){
        // create variables
        int num, denom;

        // create Scanner
        Scanner s2 = new Scanner(item);
        s2.useDelimiter("/");
        
        // get 1st integer
        num = s2.nextInt();
        
        // check for 2nd integer & return Fraction
        if(s2.hasNext()){
            denom = s2.nextInt();
            return new Fraction(num, denom);
        }
        else{
            return new Fraction(num, 1);
        }
    }

}