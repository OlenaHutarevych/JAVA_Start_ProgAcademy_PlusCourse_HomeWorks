package cycles;
//2) С помощью циклов вывести на экран все простые числа от 1 до 100.
//Простое число — число которое делиться нацело только на единицу или
//само на себя. Первые простые числа это — 2,3,5,7…

public class HW2Level2 {
    public static void main(String[] args) {
        for (int i = 1; i<=9; i+=1){

        }
        for (int i = 1; i<=100; i+=1){
            if (i % 2 !=0 && i % 3 !=0 && i%5 !=0 && i %7 !=0 || i==2 || i==3 || i==1 || i==5 || i==7){
                System.out.println(i);
            }
        }
    }
}
