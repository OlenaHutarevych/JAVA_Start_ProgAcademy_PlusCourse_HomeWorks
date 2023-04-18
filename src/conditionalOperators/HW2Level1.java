package conditionalOperators;
// Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
//начинается с единицы. На одном этаже 4 квартиры. Напишите программу
//которая получит номер квартиры с клавиатуры, и выведет на экран на
//каком этаже, какого подъезда расположенна эта квартира. Если такой
//квартиры нет в этом доме то нужно сообщить об этом пользователю.

import java.util.Scanner;

public class HW2Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a flat number : ");

        int number = input.nextInt();
        int floor;
        int porch;

        if((number>=1)&&(number<=36)){
            if (number%4 == 0){
                floor = number/4;
            }
            else {
                floor=number/4+1;
            }
            porch = 1;
            System.out.println("the flat number "+number+" is in "+ porch+ " porch on "+floor+ " floor");
        }
        else if ((number>36)&&(number<=72)) {
            if (number%4 == 0){
                floor = (number-36)/4;
            }
            else {
                floor=(number-36)/4+1;
            }
            porch = 2;
            System.out.println("the flat number "+number+" is in "+ porch+ " porch on "+floor+ " floor");
        }
        else if ((number>72)&&(number<=108)) {
            if (number%4 == 0){
                floor = (number-72)/4;
            }
            else {
                floor=(number-72)/4+1;
            }
            porch = 3;
            System.out.println("the flat number "+number+" is in "+ porch+ "  porch on "+floor+ " floor");
        }
        else if ((number>108)&&(number<=142)) {
            if (number%4 == 0){
                floor = (number-108)/4;
            }
            else {
                floor=(number-108)/4+1;
            }
            porch = 4;
            System.out.println("the flat number "+number+" is in "+ porch+ " porch on "+floor+ " floor");
        }
        else {
            System.out.println("There is no such flat in this building");
        }
    }
}
