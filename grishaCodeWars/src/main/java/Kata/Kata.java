package Kata;

import java.util.Arrays;

//Create by Grigoriy Skobelev
public class Kata {
    public static int[] sortArray(int[] array) {

        int count = 0;
        for (int c:array
        ) {
            if(c % 2 != 0) count++;
        }
        int j=0;
        int[] oddArray = new int[count];
        for(int i =0;i<array.length; i++){
            if(array[i] % 2 != 0){
                oddArray[j] = array[i];
                j++;
                array[i] = 7;
            }
        }

        Arrays.sort(oddArray);
        j=0;
        for(int i = 0; i<array.length;i++){
            if(array[i] == 7){
                array[i] = oddArray[j];
                j++;
            }
        }

        return array;
    }
}
