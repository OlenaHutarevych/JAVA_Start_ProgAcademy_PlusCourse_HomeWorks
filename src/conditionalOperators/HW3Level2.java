package conditionalOperators;
//Проверить, является ли четырехзначное число счастливым билетом.
//Дано четырехзначное число. Проверить, является ли оно «счастливым
//билетом». Примечание: счастливым билетом называется число, в
//котором - при четном количестве цифр в числе сумма цифр его левой
//половины равна сумме цифр его правой половины. Например,
//рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
//оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)

import java.util.Scanner;

public class HW3Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number : ");
        int x = input.nextInt();

        int first = x/1000 + x%1000/100;
        if (first/10 > 0){
            first = first/10+ first%10;
        }

        int second = x%100/10+x%100%10;
        if (second /10 > 0){
            second  = second /10+ second %10;
        }
        if (first==second){
            System.out.println("The ticket is lucky");
        }
        else {
            System.out.println("The ticket is not lucky");
        }
    }
}
