package kata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SqProd2Sum {

    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> outData = new ArrayList<long[]>();

        long sum = (a*a+b*b)*(c*c+d*d);

        long[] temp;

        for(int i =0; i < Math.sqrt(sum);i++){
            temp = new long[2];
            for(int j = 0; j < Math.sqrt(sum);j++){
                if((j*j + i*i) == sum) {

                    if(j>i){
                        temp[0] = i;
                        temp[1] = j;
                        if(!outData.contains(temp)) outData.add(temp);
                    }else {
                        temp[0] = j;
                        temp[1] = i;
                        if(!outData.contains(temp)) outData.add(temp);
                    }
                }
            }
        }

        return outData;
    }

    public static void main(String[] args) {
        List<long[]> exp = new ArrayList<long[]>();
        long[] cc = new long[] {1, 7};
        exp.add(cc);
        long[] dd = new long[] {5, 5};
        exp.add(dd);
        exp.remove(cc);
        for (long[] a: exp
        ) {
            System.out.println(a[0]+" "+a[1]);
        }

    }
}
