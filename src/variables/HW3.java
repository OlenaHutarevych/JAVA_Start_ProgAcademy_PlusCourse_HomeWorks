package variables;
//3)Написать программу которая вычислит и выведет на экран
//длину окружности, если ее радиус считывается с клавиатуры

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input radius ");
        double radius = input.nextDouble();
        double lengthCircle = 2*Math.PI*radius;
        System.out.println("the circle length with radius "+ radius+ " is: "+ lengthCircle);
    }
}
