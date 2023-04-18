package arrays;
//3)Ввести с клавиатуры число (до тысячи) которое обозначает
//количество долларов и центов пользователя. Вывести это количество
//прописью. (4 часа)
//Например:
//How much money do you have?
//123,34
//You have: one hundred twenty three dollars thirty four cents

import java.util.Arrays;
import java.util.Scanner;

public class HW3Level2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How much money do you have? ");
        String[] money = input.nextLine().split(",");

        String resultDollars="";
        String resultCents="";

        char [] dollars = money[0].toCharArray();
        char[] cents = money[1].toCharArray();


        String [] words1 =  {null,"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String [] words2 =  {"ten","eleven","twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen","nineteen"};
        String [] words10 = {null,null,"twenty","thirty", "forty", "fifty", "sixty", "seventy", "eighty","ninety"};

        if (dollars.length == 3){
            resultDollars = switchh(dollars[0], words1) + " hundred ";
            if (dollars[1]=='1'){
                resultDollars+=switchh(dollars[2],words2);
            }
            else {
                resultDollars+=switchh(dollars[1],words10)+" "+switchh(dollars[2],words1);
            }

        }
        else if (dollars.length == 2){
            if (dollars[0]=='1'){
                resultDollars+=switchh(dollars[1],words2);
            }
            else {
                resultDollars+=switchh(dollars[0],words10)+" "+switchh(dollars[1],words1);
            }
        }
        else {
            resultDollars+=switchh(dollars[0],words1);
        }


        if (cents[0]=='1'){
            resultCents+=switchh(cents[1],words2);
        } else {
            resultCents+=switchh(cents[0],words10)+" "+switchh(cents[1],words1);
        }

        System.out.println("You have "+ resultDollars+ " dollars "+ resultCents+" cents");

    }
  public static String switchh(char x, String [] words){
        String result = "";
        switch (x){
            case ('0'):
                result = words[0];
                break;
            case('1'):
                result = words[1];
                break;
            case('2'):
                result =words[2];
                break;
            case('3'):
                result = words[3];
                break;
            case('4'):
                result = words[4];
                break;
            case('5'):
                result = words[5];
                break;
            case('6'):
                result = words[6];
                break;
            case('7'):
                result = words[7];
                break;
            case('8'):
                result = words[8];
                break;
            case('9'):
                result = words[9];
                break;
        }
        return result;
    }
}
