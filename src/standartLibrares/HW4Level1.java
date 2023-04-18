package standartLibrares;
//4) Выведите на экран 10 строк со значением числа Пи. Причем в первой
//строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.

import java.util.Formatter;

public class HW4Level1 {
    public static void main(String[] args) {
        for (int i = 2; i <12; i+=1){
            System.out.println(i+ " commas: "+piString(i));
        }
    }
    static String piString (int commas){
        Formatter form = new Formatter();
        form.format("%." + commas+"f",Math.PI);
        return form.toString();
    }
}
