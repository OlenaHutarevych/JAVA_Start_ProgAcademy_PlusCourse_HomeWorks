package cycles;
//) С помощью циклов нарисовать «обои». Причем количество полос
//должно вводиться с клавиатуры. В примере 7 полос.
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***
//***+++***+++***+++***

import java.util.Scanner;

public class HW1Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of lines: ");
        int lines = input.nextInt();
        System.out.println("Input the number of column: ");
        int columns = input.nextInt();

        for (int i = 1; i<=lines; i+=1){
            for (int j = 1; j <=columns; j+=1){
                if (j % 2 !=0){
                    System.out.print("***");
                }
                else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
