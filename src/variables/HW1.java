package variables;
//1) Написать программу которая считывает 5-и значное число с
//клавиатуры и выводит цифры из которого оно состоит.
//Например : Считывается число 54698
//Выводиться:
//5
//4
//6
//9
//8

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the number: ");
        int number = input.nextInt();
        int result;
        result = number/10000;
        System.out.println(result);
        result = number%10000/1000;
        System.out.println(result);
        result = number%1000/100;
        System.out.println(result);
        result = number%100/10;
        System.out.println(result);
        result = number%10;
        System.out.println(result);
   }
}
