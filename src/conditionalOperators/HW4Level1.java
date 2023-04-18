package conditionalOperators;

import java.util.Scanner;
//Треугольник существует только тогда, когда сумма любых двух его
//сторон больше третьей. Дано: a, b, c – стороны предполагаемого
//треугольника. Напишите программу которая укажет существует такой
//треугольник или нет

public class HW4Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;


        System.out.println("input side a: ");
        a = input.nextInt();
        System.out.println("input side b: ");
        b = input.nextInt();
        System.out.println("input side c: ");
        c = input.nextInt();

        if ((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println(" this triangle exists");
        }
        else {
            System.out.println("this triangle doesn't exists");
        }
    }
}
