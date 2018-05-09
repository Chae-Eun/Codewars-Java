/**************************MY SOLUTION******************************/
public class SpinWords {
    public String spinWords(String sentence) {
        String[] str = sentence.split(" ");
        String result = "";

        for(int i = 0; i < str.length; i++){
            if(str[i].length() < 5){
                result = result + str[i];
            }
            else {
                for(int j = str[i].length()-1; j >= 0; j--){
                    result = result + str[i].charAt(j);
                }
            }

            if(i != str.length-1)
                result += " ";
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
/*******************************************************************/