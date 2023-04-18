package conditionalOperators;
//) Есть круг с центром в начале координат и радиусом 4. Пользователь
//вводит с клавиатуры координаты точки x и y. Написать программу которая
//определит лежит ли эта точка внутри круга или нет.

import java.util.Scanner;

public class HW1Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a x coordinate : ");
        int x = input.nextInt();
        System.out.println("input an y coordinate : ");
        int y = input.nextInt();

        int radius = 4;
        int x0 = 0;
        int y0 = 0;

        if((x - x0)*(x - x0)+(y-y0)*(y-y0) <= radius*radius){
            System.out.println("the point lies in the circle");
        }
        else {
            System.out.println("the point does not lie in the circle");
        }
    }
}
