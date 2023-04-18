package cycles;
// Выведите на экран «песочные часы» максимальная ширина которых
//считывается с клавиатуры (число нечетное). В примере ширина равна 5.
//*****
//***
// *
//***
//*****

import java.util.Scanner;

public class HW3Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the number: ");
        int number = input.nextInt();


        for (int i = 0; i<number; i+=1){
            if (i<number/2+1){
                for (int gap = 0; gap < i; gap+=1){
                    System.out.print(" ");
                }
                for (int star = 0; star < number-2*i; star+=1){
                    System.out.print("*");
                }
                for (int gap = 0; gap < i; gap+=1){
                    System.out.print(" ");
                }
                System.out.println();
            }
            else{
                for (int gap = 0; gap < number-i-1; gap+=1){
                    System.out.print(" ");
                }
                for (int star = 0; star < 2*i-number+2; star+=1){
                    System.out.print("*");
                }
                for (int gap = 0; gap < number-i-1; gap+=1){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
