package standartLibrares;
// 2) Расстояние Хэмминга между двумя целыми числами - это число
//позиций, в которых биты различаются .
//Для примера:
// 117 = 0 1 1 1 0 1 0 1
// 17 = 0 0 0 1 0 0 0 1
//-----------------------------------
//H = 0+1+1+0+0+1+0+0 = 3 - расстояние Хэмминга между (117,17)
// Даны два положительных целых числа (N, M) в десятичном виде. Вам
//необходимо подсчитать расстояние Хэмминга между этими двумя
//числами

import java.util.Arrays;
import java.util.Scanner;

public class HW2Level2 {
    public static void main(String[] args) {
        // створення бінарнрої форми першого і другого числа, введенних по черзі з клав-ри
        StringBuilder strN = new StringBuilder(Integer.toBinaryString(inputtingNumber()));
        StringBuilder strM = new StringBuilder(Integer.toBinaryString(inputtingNumber()));

        // вивід бінарної форми чисел на екран
        System.out.println(strN);
        System.out.println(strM);

        // в залежності від того, у якого числа більше байтів доповнення меншого нулями, щоб довжини були однаковими

        if (strN.length() > strM.length()) {
            strM = addition(strN, strM);

        } else {
            strN = addition(strM, strN);

        }
        // вивід на екран рішення задачі
        System.out.println(distanceHamming(strN, strM));
    }
    //метод, який добавляє нулі вперед числа, щоб у обидвох була рівна довжина
    static StringBuilder addition(StringBuilder first, StringBuilder second){
        char [] insert = new char [first.length()-second.length()];
        Arrays.fill(insert,'0');
        second.insert(0,insert);
        return second;
    }
    // метод, який вимирює відстань Хемінга, використовуючи побітове ^
    static int  distanceHamming (StringBuilder firstSB, StringBuilder secondSB){
        String[] first = firstSB.toString().split("");

        String[] second = secondSB.toString().split("");

        int distance = 0;
        for (int i = 0; i < first.length; i+=1){
            distance+= Integer.parseInt(first[i])^Integer.parseInt(second[i]);
        }
        return distance;
    }
    // метод, який дозволяє користувачеві ввести число з кла-ри
    static int inputtingNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the first number (positive) N = ");
        return input.nextInt();
    }
}
