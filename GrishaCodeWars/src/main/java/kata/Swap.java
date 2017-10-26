package kata;

public class Swap {

    public static String swap(String st){
       String angl = "AEIOUY";
       String angl2 = "aeiouy";
        String out = "";
       String templ = "";
        for(int i =0; i < st.length();i++){
           if(angl.contains(String.valueOf(st.charAt(i)))){
               templ= String.valueOf(st.charAt(i));
               out+=templ.toLowerCase();
           }else {
               if (angl2.contains(String.valueOf(st.charAt(i)))) {
                   templ = String.valueOf(st.charAt(i));
                   out += templ.toUpperCase();
               }else {
                   out+=String.valueOf(st.charAt(i));
               }
           }
       }
        return out;
    }

    public static void main(String[] args) {

    }
}
