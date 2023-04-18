package conditionalOperators;
//3) Определить количество дней в году, который вводит пользователь. В
//високосном годе - 366 дней, тогда как в обычном 365. Високосный год
//определяется по следующему правилу:
// Год високосный, если он делится на четыре без остатка, но если он
//делится на 100 без остатка, это не високосный год. Однако, если он
//делится без остатка на 400, это високосный год.

import java.util.Scanner;

public class HW3Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a year : ");

        int year = input.nextInt();
        int days;

        if((year%4 == 0 && year%100 !=0) || year%400 == 0){
            days = 366;
        }
        else {
            days = 365;
        }
        System.out.println("in "+ year + " is "+ days+ " days");
    }
}
