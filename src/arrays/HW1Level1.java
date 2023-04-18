package arrays;
//1) Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
//нечетных цифр в нем.

public class HW1Level1 {
    public static void main(String[] args) {
        int [] array = {0,5,2,4,7,1,3,19};
        int count=0;
        for (int i =0; i<array.length; i+=1){
            if(array[i] % 2 !=0){
                count+=1;
            }
        }
        System.out.println(" The quantity of odd numbers is: "+ count);
    }
}
