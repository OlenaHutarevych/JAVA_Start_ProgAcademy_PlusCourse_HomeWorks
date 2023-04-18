package files;
//2) Напишите метод для сохранения в текстовый файл
//двухмерного массива целых чисел.

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HW2Level1 {
    public static void main(String[] args) {
        String fileName = "hw2Level1";
        int [][]example = {{1,2,3},{4,5,6},{7,8,9},{2,58,345}};
        writeInFile(fromArrayToString(example),createNewFile(fileName));
    }
    static void writeInFile(String text, File file){
        try (PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println(text);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    static File createNewFile (String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
        return file;
    }

    public static String fromArrayToString(int [][] array){
        StringBuilder sb = new StringBuilder();
        for (int []rows:array) {
            for ( int col:rows) {
                sb.append(String.format("%-6.6s\t",""+col));// форматирование - 6символов минимум,6символов максимум плюс знак
                // плюс число из массива, кот превращается в строку, т к оно конкатенируется с форматируемім
            }
            sb.append(System.lineSeparator());

        }
        return sb.toString();
    }
}
