package conditionalOperators;
//С клавиатуры вводиться шестизначное число. Проверить, является ли
//оно палиндромом. Примечание: палиндромом называется число, слово
//или текст, которые одинакового читаются слева направо и справа налево.
//Например, это числа 143341, 5555, 7117 и т. д

import java.util.Scanner;

public class HW4Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number : ");
        int x = input.nextInt();

        if ((x/100000 == x%10)&&(x/10000%10 == x%100/10)&&(x/1000%10==x%1000/100)){
            System.out.println("the number "+ x+ " is palindrome");
        }
        else {
            System.out.println("the number "+ x+ " is not a palindrome");
        }
    }
}
