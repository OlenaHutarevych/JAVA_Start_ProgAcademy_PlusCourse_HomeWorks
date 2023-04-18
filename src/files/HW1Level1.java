package files;
//1) Создайте консольный «текстовый редактор» с возможностью
//сохранения набранного текста в файл.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW1Level1 {
    public static void main(String[] args) {
        String fileName = "hw1Level1";
        writeInFile(textInput(),createNewFile(fileName));
   }
    static String textInput(){
        StringBuilder textSB = new StringBuilder();

        Scanner input = new Scanner(System.in);
        System.out.println("Input the text below: (If you want to quit print 'exit': ");
        //String exit = "exit";

        String inputText = input.nextLine();
        while (!inputText.equalsIgnoreCase("exit"))
        {
            textSB.append(inputText);
            textSB.append(System.lineSeparator());
            inputText = input.nextLine();
        }
        return textSB.toString();
    }
    static void writeInFile(String text, File file){
        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(text);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    static  File  createNewFile (String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        return file;
    }
}
