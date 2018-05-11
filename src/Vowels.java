/**************************MY SOLUTION******************************/
import java.util.regex.Pattern;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;

        str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(Pattern.matches("[a|e|i|o|u]", str.substring(i, i+1)))
                vowelsCount++;
        }
        return vowelsCount;
    }

}

/************************BEST SOLUTION******************************/
public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
/*******************************************************************/