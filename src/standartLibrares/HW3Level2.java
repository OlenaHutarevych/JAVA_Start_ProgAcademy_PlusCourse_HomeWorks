package standartLibrares;
// ) Вовочка сидя на уроке писал подряд одинаковые числа. Когда Марья
//Ивановна забрала у него тетрадь там было несколько рядов чисел.
//Напишите программу которая определит минимальное число которое
//писал Вовочка например:
//11111111=>1
//12121212=>12
//121121121=>121

import java.util.Scanner;

public class HW3Level2 {
    public static void main(String[] args) {
        result(inputtingNumber());
    }
    static String inputtingNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the string - sequence of numbers");
        return input.nextLine();
    }
    static int result (String inputtingNumber){
        int result=9;
        String [] sequence = inputtingNumber.split("");
        for (int i = 0; i < sequence.length; i+=1){

        }
        return result;
    }
}
