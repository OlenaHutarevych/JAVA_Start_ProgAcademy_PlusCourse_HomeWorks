package standartLibrares;
//Ввести с консоли число в бинарном формате. Перевести его в
//десятичный и вывести на экран (“10” -> 2).

import java.util.Scanner;

public class HW3Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number in binary form(just 0 and 1, no spaces): ");
        String inputNumber = input.nextLine();

        int number = Integer.parseInt(inputNumber,2);
        System.out.println(number);


    }
}
