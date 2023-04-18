package arrays;
//«Перевернуть массив». Т.е. написать программу которая повернет
//базовый массив на 90,180,270 градусов по часовой стрелке. (При
//выполнении задания использовать дополнительный массив нельзя). В
//примере показан поворот на 90 градусов - (3 часа
//        [1, 2, 3, 4, 5, 6]     [1, 1, 1, 1, 1, 1]
//        [1, 2, 3, 4, 5, 6]     [2, 2, 2, 2, 2, 2]
//        [1, 2, 3, 4, 5, 6]     [3, 3, 3, 3, 3, 3]
//        [1, 2, 3, 4, 5, 6]     [4, 4, 4, 4, 4, 4]
//        [1, 2, 3, 4, 5, 6]     [5, 5, 5, 5, 5, 5]
//        [1, 2, 3, 4, 5, 6]     [6, 6, 6, 6, 6, 6]



import java.util.Arrays;

public class HW1Level2 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        for (int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        System.out.println();
//  HA 180
        /*for (int i = 0; i < arr.length; i+=1){
            for (int j = 0; j < arr[i].length/2; j+=1){
                int temt = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-1-j];
                arr[i][arr[i].length-1-j] = temt;
            }
        }
        for (int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        System.out.println();*/
// HA 90
        /*for (int i = 0; i < arr.length; i+=1){
            for (int j = 0; j < arr[i].length; j+=1){
                arr[i][j] = arr[i][i];
            }
        }
        for (int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        System.out.println();*/

// HA 270
        for (int i = 0; i < arr.length; i+=1){
            for (int j = 0; j < arr[i].length; j+=1){
                arr[i][j] = arr[i][arr.length-1-i];
            }
        }
        for (int[] el : arr){
            System.out.println(Arrays.toString(el));
        }
        System.out.println();
   }
}
