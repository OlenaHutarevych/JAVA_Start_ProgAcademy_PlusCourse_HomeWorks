package methods;
//3) Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
//— его параметрами будут целые числа которые описывают длину и
//ширину такого прямоугольника.

import java.util.Scanner;

public class HW3Level1 {
    public static void main(String[] args) {
        drawingRectangle(inputInt(),inputInt());

    }
    static void drawingRectangle(int a, int b){
        for (int i = 0; i<a; i+=1){
            for (int j = 0; j < b; j+=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int inputInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("input the number: ");
        int inputInt= input.nextInt();
        return inputInt;
    }
}
