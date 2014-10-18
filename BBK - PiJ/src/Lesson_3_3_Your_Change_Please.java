import java.util.Scanner;

public class Lesson_3_3_Your_Change_Please {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double price, money, change;
        
        System.out.println("This program will tell you your exact change after buying something.");
        System.out.print("First, enter the price of the thing you are going to buy: ");
        price = s.nextDouble();
        System.out.print("Next, enter the amount of money you are handing over: ");
        money = s. nextDouble();
        System.out.println();
        
        change = money - price;
        
        if(change < 0){
            System.out.println("You didn't pay enough to buy something.");
        }
        else if (change == 0){
            System.out.println("You paid the exact amount so there is no change.");
        }
        else{
            System.out.println("Your change comes in the following amounts:");
            System.out.println();
            if(change >= 50){
                System.out.println("£50 :   " + (int)(change/50));
                change = change%50;
            }
            if(change >= 20){
                System.out.println("£20 :   " + (int)(change/20));
                change = change%20;
            }
            if(change >= 10){
                System.out.println("£10 :   " + (int)(change/10));
                change = change%10;
            }
            if(change >= 5){
                System.out.println("£5  :   " + (int)(change/5));
                change = change%5;
            }
            if(change >= 2){
                System.out.println("£2  :   " + (int)(change/2));
                change = change%2;
            }
            if(change >= 1){
                System.out.println("£1  :   " + (int)(change/1));
                change = change%1;
            }
            if(change >= .5){
                System.out.println("50p :   " + (int)(change/.5));
                change = change%.5;
            }
            if(change >= .2){
                System.out.println("20p :   " + (int)(change/.2));
                change = change%.2;
            }
            if(change >= .1){
                System.out.println("10p :   " + (int)(change/.1));
                change = change%.1;
            }
            if(change >= .05){
                System.out.println("5p  :   " + (int)(change/.05));
                change = change%.05;
            }
            if(change >= .02){
                System.out.println("2p  :   " + (int)(change/.02));
                change = change%.02;
            }
            if(change >= .01){
                System.out.println("1p  :   " + (int)(change/.01));
                change = change%.01;
            }
        }
        
    }
    
}