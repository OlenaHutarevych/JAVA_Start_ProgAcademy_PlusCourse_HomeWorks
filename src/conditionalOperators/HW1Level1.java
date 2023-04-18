package conditionalOperators;
//1) Написать программу которая считает 4 числа c клавиатуры и выведет на
//экран самое большое из них.

import java.util.Scanner;

public class HW1Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int max;

        System.out.println("input number a: ");
        a = input.nextInt();
        System.out.println("input number b: ");
        b = input.nextInt();
        System.out.println("input number c: ");
        c = input.nextInt();
        System.out.println("input number d: ");
        d = input.nextInt();

        max= a;
        if(b>=a){
            max = b;
        }
        if (max<=c){
            max = c;
        }
        if (max<=d){
            max = d;
        }

        System.out.println(" maximum is: "+ max);
    }
}
