package arrays;

import java.util.Arrays;
import java.util.Scanner;

//2) Написать код для возможности создания массива целых чисел (размер
//вводится с клавиатуры) и возможности заполнения каждого его элемента
//вручную. Выведите этот массив на экран.
public class HW2Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the lengh of array: ");
        int lenght = input.nextInt();

        int [] array = new int[lenght];
        for (int i =0; i < array.length; i+=1){
            System.out.println(" Input the "+(i+1)+ "  member of array: ");
            array[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
