package methods;
//1) Напишите метод который вернет максимальное число из массива целых чисел.

import java.util.Arrays;

public class HW1Level1 {
    public static void main(String[] args) {
        int [] array = new int [] {1,5,8,9,58,2,6,7};
        System.out.println("The maximum in array "+ Arrays.toString(array)+ " is "+ getmax(array));
    }
    static int getmax(int [] arr){
        int max = arr[0];
        for (int el : arr){
            if (el >= max){
                max = el;
            }
        }
        return max;
    }
}
