package methods;

import java.util.Scanner;

//1)Существуют такие последовательности чисел
//0,2,4,6,8,10,12
//1,4,7,10,13
//1,2,4,8,16,32
//1,3,9,27
//1,4,9,16,25
//1,8,27,64,125
//Реализуйте программу которая выведет следующий член этой
//последовательности (либо подобной им). Например пользователь вводит
//строку 0,2,4,6,8,10,12 ответом программы должно быть число 14. (6 часов)
public class HW1Level2 {
    public static void main(String[] args) {
        int [] example = sequence(inputString());


        if (isEvenNumbers(example)){
            System.out.println(evenNumbers(example));
        } else if (isPlusThree(example)) {
            System.out.println(plusThree(example));
        } else if (isTwoPow(example)) {
            System.out.println(twoPow(example));
        } else if (isThreePow(example)) {
            System.out.println(threePow(example));
        } else if (isFivePow(example)) {
            System.out.println(fivePow(example));
        } else if (isSquares(example)) {
            System.out.println(squares(example));
        } else if (isCubes(example)) {
            System.out.println(cubes(example));
        } else {
            System.out.println("something wrong");
        }
    }
    static boolean isEvenNumbers (int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length-1; i+=1){
            if ((inputData[i]%2 == 0) && (inputData[i+1] == inputData[i]+2)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static int evenNumbers (int [] inputData){
        int result = inputData[inputData.length-1]+2;
        return result;
    }
    static boolean isPlusThree(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length-1; i+=1){
            if ((inputData[i+1] == inputData[i]+3)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static int plusThree (int [] inputData){
        int result = inputData[inputData.length-1]+3;
        return result;
    }
    static boolean isTwoPow(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length; i+=1){
            if (inputData[i] == Math.pow(2,i)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static double twoPow (int [] inputData){
        double result = Math.pow(2,inputData.length);
        return result;
    }
    static boolean isThreePow(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length; i+=1){
            if (inputData[i] == Math.pow(3,i)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static double threePow (int [] inputData){
        double result = Math.pow(3,inputData.length);
        return result;
    }
    static boolean isFivePow(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length; i+=1){
            if (inputData[i] == Math.pow(5,i)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static double fivePow (int [] inputData){
        double result = Math.pow(5,inputData.length);
        return result;
    }
    static boolean isSquares(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length; i+=1){
            if (inputData[i] == Math.pow((i+1),2)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static double squares (int [] inputData){
        double result = Math.pow((inputData.length+1),2);
        return result;
    }
    static boolean isCubes(int [] inputData){
        boolean result = false;
        for (int i = 0; i < inputData.length; i+=1){
            if (inputData[i] == Math.pow((i+1),3)){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    static double cubes (int [] inputData){
        double result = Math.pow(inputData.length+1,3);
        return result;
    }

    public static String inputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("input the sequence ");
        String string = input.nextLine();
        return string;
    }
    public static int[] sequence(String inputString){
        String [] sequenceString = inputString.split(" ");
        int [] result = new int [sequenceString.length];
        for (int i =0; i< result.length; i+=1){
            result[i] = Integer.parseInt(sequenceString[i]);
        }
        return result;
    }
}
