package arrays;
//4) Введите строку текста с клавиатуры — реализуйте программу для
//возможности подсчета количества символа — 'b' в этой строке, с выводом
//результат на экран.

import java.util.Scanner;

public class HW4Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input the string: ");
        String str = input.nextLine();

        char [] arrChars = str.toCharArray();
        int count=0;
        for(char element : arrChars){

            if (element == 'b'){
                count+=1;
            }
        }
        System.out.println("The 'b' symbol meets " + count +" times in the string " + "'"+str+"'");


    }
}
