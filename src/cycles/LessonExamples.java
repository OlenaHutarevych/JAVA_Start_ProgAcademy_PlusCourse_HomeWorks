package cycles;

import java.util.Scanner;

public class LessonExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int x = input.nextInt();

        for (int i = 1; i <= 100; i+=1){
            if (i%x !=0) {
                System.out.print(i+ " ");
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println("Input the number: ");
        int y = input.nextInt();
        for (int i = 1; i <= y; i+=1){
            for (int j = 1; j <= i; j+=1){
                System.out.print(" * ");
            }
            System.out.println();
        }



    }
}
