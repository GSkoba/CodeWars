package Kata;

import java.util.stream.IntStream;

//Create by Grigoriy Skobelev
public class Dinglemouse {


    public static int countOfChar (String str, String key){
        int coutn = 0;
        for(int i = 0; i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equals(key)) coutn++;
        }
        return coutn;
    }

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] coutOfNumber = new int [10];
        for(int i = start; i<=end;i++){
            if(String.valueOf(i).contains("0")) coutOfNumber[0]+= countOfChar(String.valueOf(i), "0");
            if(String.valueOf(i).contains("1")) coutOfNumber[1]+=countOfChar(String.valueOf(i), "1");
            if(String.valueOf(i).contains("2")) coutOfNumber[2]+=countOfChar(String.valueOf(i), "2");
            if(String.valueOf(i).contains("3")) coutOfNumber[3]+=countOfChar(String.valueOf(i), "3");
            if(String.valueOf(i).contains("4")) coutOfNumber[4]+=countOfChar(String.valueOf(i), "4");
            if(String.valueOf(i).contains("5")) coutOfNumber[5]+=countOfChar(String.valueOf(i), "5");
            if(String.valueOf(i).contains("6")) coutOfNumber[6]+=countOfChar(String.valueOf(i), "6");
            if(String.valueOf(i).contains("7")) coutOfNumber[7]+=countOfChar(String.valueOf(i), "7");
            if(String.valueOf(i).contains("8")) coutOfNumber[8]+=countOfChar(String.valueOf(i), "8");
            if(String.valueOf(i).contains("9")) coutOfNumber[9]+=countOfChar(String.valueOf(i), "9");
        }
        return coutOfNumber;
    }

    public static void main(String[] args) {
        int[] a = paintLetterboxes(125,132);
    }
}
