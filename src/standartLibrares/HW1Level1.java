package standartLibrares;
//1) Написать программу которая вернет количество миллисекунд
//прошедших от такого же числа, но в прошлом месяце до сегодняшней
//даты. Например если сегодня 3 августа, то узнать сколько миллисекунд
//прошло с 3 июля.

import java.util.Calendar;
import java.util.Date;

public class HW1Level1 {
    public static void main(String[] args) {
        // для змінної dayToday отримання сьогоднішньої дати
        Calendar dayToday = Calendar.getInstance();
        // для змінної monthAgo отримання сьогоднішньої дати
        Calendar monthAgo = Calendar.getInstance();
        // для змінної monthAgo  встановлення дити місячь тому
        monthAgo.set(Calendar.MONTH, (Calendar.MONTH-1));

        // отримання обєктів Date  для сьогодні і місяць тому з обєктів Calendar
        Date dayTodayD = dayToday.getTime();
        Date monthAgoD = monthAgo.getTime();
        // визначення кількості мілісекунд з 1970р по сьогодні і по дату місяць тому
        long td = dayTodayD.getTime();
        long ma = monthAgoD.getTime();
        // отримання різниці - скільки пройшло мілісекунд із місяць тому по сьогодні
        long m = td - ma;
        System.out.println(m);

        // все те саме, але коротше
        System.out.println((dayToday.getTime().getTime() - monthAgo.getTime().getTime()));
    }
}
