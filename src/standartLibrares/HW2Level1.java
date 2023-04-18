package standartLibrares;

import java.util.Arrays;

//2) Написать свой вариант метода Arrays.toString() для int[].

public class HW2Level1 {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6,7,8,9,11111};
        System.out.println(Arrays.toString(arr));
        System.out.println(arrToString(arr));
    }
    static String arrToString (int [] arr){
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int el : arr){
            result.append(el);
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }
}
