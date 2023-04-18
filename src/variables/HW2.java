package variables;
//2)Написать программу которая вычислит и выведет на экран
//площадь треугольника если известны его стороны.

import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input the first side: ");
        double first = input.nextDouble();
        System.out.println("input the second  side: ");
        double second = input.nextDouble();
        System.out.println("input the third  side: ");
        double third = input.nextDouble();
        double perimetrHalf = (first+second+third)/2;

        double square = Math.sqrt(perimetrHalf*(perimetrHalf-first)*(perimetrHalf-second)*(perimetrHalf-third));
        System.out.println("the square of triange is: "+ square);

    }
}
