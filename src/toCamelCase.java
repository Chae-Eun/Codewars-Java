/**************************MY SOLUTION******************************/
public class toCamelCase {
    static String toCamelCase(String s){
        String str = "";
        String result = "";
        int p = 0;

        for(int i = 0; i < s.length(); i++){
            str = s.substring(i, i+1);

            if(str.contains("-")  || str.contains("_")) {
                p = 1;
            }
            else{
                if(p == 0){
                    result += str;
                }
                else {
                    result += str.toUpperCase();
                    p = 0;
                }
            }
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
import java.lang.StringBuilder;
class Solution{
    static String toCamelCase(String s){
        String[] words = s.split("[_\\-]");
        s=words[0];
        for(int i=1; i<words.length; i++)
            s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        return s;
    }
}
/*******************************************************************/