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
        
        // create Scanner
        Scanner scan = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to James Hill's Fraction Calculator.");
        System.out.println("Please enter a calculation below:");
        
        // take commands from the user, display the result or exit
        while(scan.hasNext()){
            input = scan.nextLine();
            value = evaluate(value, input);
            System.out.println(" = " + value.toString());
            }
        
        // closing
        System.out.println("Goodbye.");
    }
    
    // Evauluate the input string and return the result as a fraction.
    // This method can TERMINATE the program (this was necessary because ...
    // the specification requires an 'Exit from program' resulting from ...
    // 'q', 'Q', 'quit' etc. and these items can appear anywhere in an input ...
    // line according to the spec.)
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
                // check and note the operation or respond to other commands
                switch(item){
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if(operator.equalsIgnoreCase("")){
                            operator = item;
                            break;
                        } else {
                            System.out.println("Error : 2 consecutive operators.");
                            return new Fraction(0, 1);
                        }
                    case "a":
                    case "A":
                    case "abs":
                    case "Abs":
                        current = current.absValue();
                        break;
                    case "n":
                    case "N":
                    case "neg":
                    case "Neg":
                    case "negative":
                    case "Negative":
                        current = current.negate();
                        break;
                    case "c":
                    case "C":
                    case "clear":
                    case "Clear":
                        current = new Fraction(0, 1);
                        break;
                    case "q":
                    case "Q":
                    case "quit":
                    case "Quit":
                        System.out.println("Quit command entered. Goodbye");
                        System.exit(0);
                        break;
                    case "":
                        break;
                    default:
                        System.out.println("Error");
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
        
        // check for 2nd integer & return either the resulting whole number
        // or fraction
        if(tokens.length > 1){
            denom = Integer.valueOf(tokens[1]);
            return new Fraction(num, denom);
        }
        else{
            return new Fraction(num, 1);
        }
    }
}