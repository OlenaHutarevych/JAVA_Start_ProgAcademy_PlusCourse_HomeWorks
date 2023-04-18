package methods;
//2) Число-палиндром с обеих сторон (справа налево и слева направо)
//читается одинаково. Самое большое число-палиндром, полученное
//умножением двух двузначных чисел – 9009 = 91 × 99.
//Найдите самый большой палиндром, полученный умножением двух
//трехзначных чисел. (4 часа)

public class HW2Level2 {
    public static void main(String[] args) {

        int palindromMax=0;
        for (int i =999; i >= 100; i-=1){
            for (int j = 999; j >= 100; j-=1){
                int multiplying = i * j;
                if (isPalindrom(i*j)) {
                    if (palindromMax<=multiplying){
                        palindromMax = multiplying;
                    }
                }
           }
        }
        System.out.println("The biggest palindrome is "+palindromMax);
    }
    static boolean isPalindrom (int isPalindrom){
        boolean result = false;
        String isPalindromStr = Integer.toString(isPalindrom);
        char [] arrayCharsIsPalindrom = isPalindromStr.toCharArray();
        for (int i =0; i< arrayCharsIsPalindrom.length/2; i+=1){
            if (arrayCharsIsPalindrom[i] == arrayCharsIsPalindrom[arrayCharsIsPalindrom.length-1-i]){
                result = true;
                continue;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
