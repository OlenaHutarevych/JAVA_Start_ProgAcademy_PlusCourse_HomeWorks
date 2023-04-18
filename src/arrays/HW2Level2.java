package arrays;
// 2)Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
//массив может быть произвольной длинны. (При выполнении задания
//использовать дополнительный массив нельзя)(1 час)

import java.util.Arrays;

public class HW2Level2 {
    public static void main(String[] args) {
        int [] array = {1,2,3, 4,5,6,7,8,10,1258};
        for (int i = 0; i < array.length/2; i+=1){
            int temporary = array[i];
            array[i]= array[array.length-1-i];
            array[array.length-1-i]=temporary;
        }
        System.out.println(Arrays.toString(array));
    }


}
