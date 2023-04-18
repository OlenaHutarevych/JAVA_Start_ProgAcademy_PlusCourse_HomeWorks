package files;
//1) Напишите метод для считывания двухмерного массива из
//файла (размер массива заранее неизвестен, определите его
//сами на основе данных в файле).

// будет работать если выполняются условия - массив в каждой строке имеет равное количество столбцов
// массив в файле записан таким образом - число пробел, т к пробел используется в качестве разделилеля

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HW1Level2 {
    public static void main(String[] args) {
        //виведемо на екран текст, який зчитаємо з файла цього example2.java
        // спочатку створимо посилання класу файл на на потрібний нам файл example2.java
        File file = new File("matrixHW1Level2.txt");
        // тепер застосуємо метод, що зчитує дані з файлу
        String [] arrayStringForm  = loadTextFromFile(file).toString().split("h");


        int rows = arrayStringForm.length;
        int columns = arrayStringForm [0].split(" ").length;

        int [][] array = new int [rows][columns];

        for (int i = 0; i < rows; i+=1){
            String [] arrayString = arrayStringForm[i].split(" ");
            for (int j =0; j< columns; j+=1){
                array[i][j] = Integer.parseInt(arrayString[j]);
            }
        }
        for (int i = 0; i < rows; i+=1){
            System.out.println(Arrays.toString(array[i]));
        }
    }
    static StringBuilder loadTextFromFile(File file){
        // будемо накоплювати те, що зчитуємо тут у StringBuilder sb
        StringBuilder sb = new StringBuilder();

        try (Scanner sc = new Scanner(file)){
            for (; sc.hasNextLine();){ // цикл - допоки є строки(дослівно - поки обєкт sc має строки hasNextLine)
                String row = sc.nextLine();
                sb.append(row); // дописати в sb строку з sc

                sb.append("h"); // дописати в sb перевод строки, коли закінчилась зчитуєма,
                // щоб строки не злились в одну суцільну
            }
       }
        catch (IOException e){
            System.out.println(e);
        }
        return sb;
    }
}
