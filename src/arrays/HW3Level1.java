package arrays;
//3) Создать массив случайных чисел (размером 15 элементов). Создайте
//второй массив в два раза больше, первые 15 элементов должны быть
//равны элементам первого массива, а остальные элементы заполнить
//удвоенных значением начальных. Например
//Было → {1,4,7,2}
//Стало → {1,4,7,2,2,8,14,4}

import java.util.Arrays;
import java.util.Scanner;

public class HW3Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the length of array: ");
        int lengh = input.nextInt();

        int [] arr1 = new int [lengh];
        //= new int[lenght*2];

        for(int i =0; i< arr1.length; i+=1){
            arr1[i] = (int)(10*Math.random());
        }
        System.out.println(Arrays.toString(arr1));
        int [] arr2 =Arrays.copyOf(arr1,lengh*2);
        for (int i =lengh; i< arr2.length; i+=1){
            arr2[i]= arr1[i-lengh]*2;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
