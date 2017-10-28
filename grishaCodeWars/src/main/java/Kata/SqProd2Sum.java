package Kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create by Grigoriy Skobelev
public class SqProd2Sum {

    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> outData = new ArrayList<long[]>();

        long sum = (a*a+b*b)*(c*c+d*d);

        for(int i =0; i < Math.sqrt(sum);i++){
            for(int j = 0; j < Math.sqrt(sum);j++){
                if((j*j + i*i) == sum) {
                    if(j>i){
                        outData.add(new long[]{i,j});
                    }else {
                        outData.add(new long[]{j,i});
                    }

                }
            }
        }

        return outData;
    }

    public static void main(String[] args) {
        List<long[]> result = prod2Sum(1,2,1,3);
    }


    public static List<long[]> prod3Sum(long a, long b, long c, long d) {
        List<long[]> result = new ArrayList<>();
        long n = (a*a + b*b) * (c*c + d*d);
        long[] sums = new long[] { Math.abs(a*c+b*d),Math.abs(a*d+b*c),
                Math.abs(a*c-b*d), Math.abs(a*d-b*c)};

        for (long e : sums) {
            for (long f : sums) {
                if (Math.pow(e, 2) + Math.pow(f, 2) == n) {
                    long[] pair = new long[] { Math.min(e, f), Math.max(e, f)};
                    if (result.stream().noneMatch(arr -> Arrays.equals(arr, pair)))
                        result.add(pair);
                }
            }
        }

        result.sort((i, j) -> Long.compare(i[0], j[0]));
        return result;
    }
}
