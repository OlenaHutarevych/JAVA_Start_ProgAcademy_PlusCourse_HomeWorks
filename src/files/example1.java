package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class example1 {
    public static void main(String[] args) {
        int [][]example = {{1,2,3},{4,5,6},{7,8,9},{2,58,345}};
        String result = fromArrayToString(example);
        System.out.println(result);
        File fileOne = new File("matrix.txt");
        saveTextToFile(result,fileOne);


    }
// метод, що записує текст text у файл file за допомогою класу принтрайтер PrintWriter
    public static void saveTextToFile (String text, File file){
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
    // приклад - метод, що записує двомірний масив у строку
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
