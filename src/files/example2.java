package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        //виведемо на екран текст, який зчитаємо з файла цього example2.java
        // спочатку створимо посилання класу файл на на потрібний нам файл example2.java
        File file = new File("src/files/example2.java");
        // тепер застосуємо метод, що зчитує дані з файлу
        String result = loadTextFromFile(file);
        // виведемо дані на екран
        System.out.println(result);

    }
    // метод, що зчитує дані з файлу file за допомогою Scanner
    static String loadTextFromFile(File file){
        // будемо накоплювати те, що зчитуємо тут у StringBuilder sb
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(file)){
            for (; sc.hasNextLine();){ // цикл - допоки є строки(дослівно - поки обєкт sc має строки hasNextLine)
                sb.append(sc.nextLine()); // дописати в sb строку з sc
                sb.append(System.lineSeparator()); // дописати в sb перевод строки, коли закінчилась зчитуєма,
                // щоб строки не злились в одну суцільну
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
        return sb.toString();
    }
    // метод, що зчитує дані з файлу file за допомогою BufferedReader(працює тільки зі строками)

    static  String fastLoadTextFromFile(File file){
        // будемо накоплювати те, що зчитуємо тут у StringBuilder sb
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String st = "";
            for(;((st = br.readLine())!=null);){
                sb.append(st);
                sb.append(System.lineSeparator());
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
        return sb.toString();
    }
}
