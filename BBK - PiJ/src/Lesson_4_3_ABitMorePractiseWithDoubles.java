import java.util.Scanner;

public class Lesson_4_3_ABitMorePractiseWithDoubles {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter your mortgage data below.");
        System.out.println();
        
        System.out.print("What is the total amount you borrowed?  ");
        Double totalBorrowed = s.nextDouble();
        
        System.out.print("How many years will you pay?  ");
        Double years = s.nextDouble();
        
        System.out.print("What is your interest rate?  ");
        Double interestRate = s.nextDouble();
        
        System.out.println();
        
        System.out.printf("The total amount to be paid is £%.2f.\n", TotalToPay(totalBorrowed, interestRate));
        System.out.printf("The amount to be paid each year is £%.2f.\n", YearlyPayment(TotalToPay(totalBorrowed, interestRate), years));
        System.out.printf("It will take %.2f years to pay off the interest.\n", YearsToPayInterest(totalBorrowed,
                TotalToPay(totalBorrowed, interestRate),
                YearlyPayment(TotalToPay(totalBorrowed, interestRate), years)));
        
    }
    
    static double TotalToPay(double borrowed, double rate){
        double totalToPay = borrowed * (1 + (rate / 100));
        return totalToPay;
    }
    
    static double YearlyPayment(double totalToPay, double years){
        double yearlyPayment = totalToPay / years;
        return yearlyPayment;
    }
    
    static double YearsToPayInterest(double borrowed, double totalToPay, double yearlyPayment){
        double yearsToPayInterest = (totalToPay - borrowed) / yearlyPayment;
        return yearsToPayInterest;
    }
    
}