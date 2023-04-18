package cycles;
//1) С помощью цикла (только одного) нарисовать такую фигуру. Причем
//максимальная высота этой фигуры вводиться с клавиатуры (в примере
//максимальная высота - 4)
//*
//**
//***
//****
//***
//**
//*



import java.util.Scanner;

public class HW1Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the height: ");
        int height = input.nextInt();

        for (int i = 1; i <=(height*2 -1); i+=1){
            if (i / height ==0 || (i/height==1 && i%height==0)){
                for (int j = 1; j<=i; j+=1){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j = 1; j<=2*height-i; j+=1){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
