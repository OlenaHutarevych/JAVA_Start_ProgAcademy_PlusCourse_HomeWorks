package cycles;

import java.util.Scanner;

//Выведите на экран прямоугольник из *. Причем высота и ширина
//прямоугольника вводятся с клавиатуры. Например ниже представлен
//прямоугольник с высотой 4 и шириной 5.
//*****
//*   *
//*   *
//*****
public class HW4Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the height: ");
        int height = input.nextInt();
        System.out.println("Input the width: ");
        int width = input.nextInt();

        for (int i = 1; i<= height; i+=1){

            for (int j = 1; j <= width; j+=1){
                if (i == 1 || i == height){
                    System.out.print("*");
                    continue;
                }
                if (j == 1 || j==width){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
