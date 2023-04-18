package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = input.nextInt();

        int [][] arr = new int [n][n];
        int sum =0;
        for (int i=0; i< arr.length; i+=1){
            for (int j = 0; j < arr[i].length;j+=1){
                arr[i][j] = j+1;
                if (i == j){
                    sum+=arr[i][j];
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(sum);
    }
}
