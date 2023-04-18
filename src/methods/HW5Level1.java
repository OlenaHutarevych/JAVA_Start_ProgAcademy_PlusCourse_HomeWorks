package methods;
// Напишите метод который вернет количество слов в строке текста.

import java.util.Scanner;

public class HW5Level1 {
    public static void main(String[] args) {
        String inputString = inputString();
        System.out.println("Tne quantity of words in string '"+inputString+"' is "+ quantityOfWords(inputString));
    }
    static int quantityOfWords(String string){
        int result  = 0;
        String [] arrayOfWords = string.split(" ");
        result = arrayOfWords.length;
        return result;
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        System.out.println("input the string: ");
        String string= input.nextLine();
        return string;
    }
}
