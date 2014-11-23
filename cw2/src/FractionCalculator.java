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
        Fraction value = new Fraction(0,1);
        boolean quit = false;
        
        // create Scanner
        Scanner scan = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to James Hills' Fraction Calculator.");
        System.out.println("Please enter a calculation below:");
        
        // take commands from the user, display the result or exit
        do  {
            input = scan.nextLine();
            switch(input){
                case "q":
                case "Q":
                case "quit":
                case "Quit":
                    quit = true;
                    break;
                default:
                    value = evaluate(value, input);
                    System.out.println(" = " + value.toString());
                }
            } while (!quit);
        
        // closing
        System.out.println("Goodbye.");
    }
    
    // Evauluate the input string and return the result as a fraction
    public Fraction evaluate(Fraction fraction, String inputString) {
        
        // create variables
        String operator = "";
        Fraction current = fraction;
        String item;
        String delims = "[ ]+";
        String[] tokens = inputString.split(delims);
        boolean hasDigit = false;
        
        // parse the string and perform calculations
        for(int i = 0; i < tokens.length; i++) {
            item = tokens[i];
            
            for(int j = 0; j < item.length(); j++){
                if(Character.isDigit(item.charAt(j))){
                    hasDigit = true;
                }
            }
            
            // parse numerals
            if(hasDigit){
                switch(operator){
                    case "+":
                        current = current.add(parseNumerals(item));
                        operator = "";
                        break;
                    case "-":
                        current = current.subtract(parseNumerals(item));
                        operator = "";
                        break;
                    case "*":
                        current = current.multiply(parseNumerals(item));
                        operator = "";
                        break;
                    case "/":
                        current = current.divide(parseNumerals(item));
                        operator = "";
                        break;
                    default:
                        current = parseNumerals(item);
                }
                hasDigit = false;
            }
            else{
                // check and note the operation
                switch(item){
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if(operator.equalsIgnoreCase("")){
                            operator = item;
                            break;
                        } else {
                            System.out.println("Error");
                            return new Fraction(0, 1);
                        }
                    case "a":
                    case "A":
                    case "abs":
                        current = current.absolute();
                        break;
                    case "n":
                    case "N":
                    case "neg":
                    case "Neg":
                    case "negative":
                    case "Negative":
                        current = current.negative();
                        break;
                    case "c":
                    case "C":
                    case "clear":
                    case "Clear":
                        current = new Fraction(0, 1);
                        break;
                    case "":
                        break;
                    default:
                        System.out.println("Error");
                        operator = "";
                        return new Fraction(0, 1);
                }
            }
        }
        
        return current;
    }
    
    // take a string representing a fraction or whole number, determine which,
    // and output as a Fraction object
    private Fraction parseNumerals(String item){
        // create variables
        int num, denom;
        String delim = ("[/]");
        String tokens[] = item.split(delim);
        
        // get 1st integer
        num = Integer.valueOf(tokens[0]);
        
        // check for 2nd integer & return either the resulting whole number or fraction
        if(tokens.length > 1){
            denom = Integer.valueOf(tokens[1]);
            return new Fraction(num, denom);
        }
        else{
            return new Fraction(num, 1);
        }
    }
}