package kata;

import java.util.Arrays;
import java.util.List;

public class Same {
    public static boolean comp(int[] a, int[] b) {
       try{
        if(a.length != b.length ) return false;

       boolean haveSema = false;

       for(int i = 0; i < b.length;i++){

           for (int j = 0; j<a.length; j++){
               if(a[j]*a[j] == b[i]) haveSema = true;
           }
           if(haveSema == false) return false;
           haveSema = false;
       }

        return true;
       }catch (Exception ex){
           return false;
       }
    }

}
