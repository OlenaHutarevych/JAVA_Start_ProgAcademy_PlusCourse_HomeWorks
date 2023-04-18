package methods;
//4) Напишите метод который реализует линейный поиск элемента в массиве
//целых чисел. Если такой элемент в массиве есть то верните его индекс,
//если нет то метод должен возвращать число - «-1»

import java.util.Arrays;

public class HW4Level1 {
    public static void main(String[] args) {
        int [] array  = new int [] {4,5,8,9,56,89,2,789};
        int element = 789;
        System.out.println(findElement(array,element));
    }
    static int findElement(int [] array, int element){
        int result = Arrays.binarySearch(array,element);
        if (result < 0){
            result = -1;
        }
        return result;
    }
}
