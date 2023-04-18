package methods;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String inputString = inputString();
        String inputSymbol = inputSymbol();
       int quantity = quantityOfSymbol(inputString,inputSymbol);
       System.out.println("The symbol '"+ inputSymbol+ "'"+" in the string '"+ inputString+"'"+ " is meeting "+ quantity+ " times");
   }
    public static int quantityOfSymbol(String str, String symbol){
        int count =0;
        String[] inputString = str.split("");
        for(String el : inputString){
            if (el.equals(symbol)){
                count+=1;
            }
        }
        return count;
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        System.out.println("input the string: ");
        String str = input.nextLine();
        return str;
    }
    public static String inputSymbol(){
        Scanner input = new Scanner(System.in);
        System.out.println("input the symbol: ");
        String symbol= input.nextLine();
        return symbol;
    }
}


