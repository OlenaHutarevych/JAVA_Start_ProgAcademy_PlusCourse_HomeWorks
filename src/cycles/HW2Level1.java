package cycles;
// Вычислить с помощью цикла факториал числа - n введенного с
//клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
//этого числа до 1. Например 5!=5*4*3*2*1=120

import java.util.Scanner;

public class HW2Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number n (4<n<16): ");
        int n = input.nextInt();
        int result=1;

        for (int i =1; i <=n; i+=1){
            result *=i;
        }
        System.out.println(result);


    }
}
