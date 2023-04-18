package conditionalOperators;
//) Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
//вводит с клавиатуры координаты точки x и y. Написать программу которая
//определит лежит ли эта точка внутри треугольника или нет

import java.util.Scanner;
// рішення через суму площ трикутників, спочатку треба знайти довжини сторін великого трикутника
// і всіх сторін маленьких трикутників, потім за формулою герона площі трикутників - якщо точка всередині трикутника,
// то сума площ трикутників малих буде дорівнювати сумі великого
public class HW2Level2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a x coordinate : ");
        int x = input.nextInt();
        System.out.println("input a y coordinate : ");
        int y = input.nextInt();

        int ax0 = 0;
        int ay0 = 0;
        int bx0 = 4;
        int by0 = 4;
        int cx0 = 6;
        int cy0 = 1;

        double ab = Math.sqrt(Math.pow((ax0-bx0),2)+ Math.pow((ay0-by0),2));
        double ac = Math.sqrt(Math.pow((ax0-cx0),2)+ Math.pow((ay0-cy0),2));
        double bc = Math.sqrt(Math.pow((bx0-cx0),2)+ Math.pow((by0-cy0),2));

        double ax = Math.sqrt(Math.pow((ax0-x),2)+ Math.pow((ay0-y),2));
        double bx = Math.sqrt(Math.pow((bx0-x),2)+ Math.pow((by0-y),2));
        double cx = Math.sqrt(Math.pow((cx0-x),2)+ Math.pow((cy0-y),2));

        double perimetrHalfAXB = (ab+bx+ax)/2;
        double perimetrHalfBXC = (bc+bx+cx)/2;
        double perimetrHalfAXC = (ac+ ax+cx)/2;
        double perimetrHalfABC = (ab+bc+ac)/2;

        double axbSquare = Math.sqrt(perimetrHalfAXB*(perimetrHalfAXB-ab)*(perimetrHalfAXB-ax)*(perimetrHalfAXB-bx));
        double axcSquare = Math.sqrt(perimetrHalfAXC*(perimetrHalfAXC-ac)*(perimetrHalfAXC-ax)*(perimetrHalfAXC-cx));
        double bxcSquare = Math.sqrt(perimetrHalfBXC*(perimetrHalfBXC-bc)*(perimetrHalfBXC-bx)*(perimetrHalfBXC-cx));
        double abcSquare = Math.sqrt(perimetrHalfABC*(perimetrHalfABC-ab)*(perimetrHalfABC-bc)*(perimetrHalfABC-ac));

        if ((axbSquare+axcSquare+bxcSquare)<=abcSquare){
            System.out.println("The point lies in the triangle");
        }
        else {
            System.out.println("The point doesn't lie in the triangle");

        }




    }
}
