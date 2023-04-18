package methods;
//2) Реализуйте метод параметрами которого являются - целое число,
//вещественное число и строка. Возвращает он конкатенацию строки с
//суммой вещественного и целого числа

import java.util.Scanner;

public class HW2Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the int number: ");
        int inputInt = input.nextInt();
        System.out.println("input the double number: ");
        double inputDouble = input.nextDouble();
        System.out.println("input the string: ");
        Scanner input1 = new Scanner(System.in);
        String inputString= input1.nextLine();

        System.out.println(concatenation(inputInt,inputDouble,inputString));
    }
    static  String concatenation (int intA, double doubleB, String stringC){
        String result="";
        result = intA+doubleB+stringC;
        return result;
    }
}
