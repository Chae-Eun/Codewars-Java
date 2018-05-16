/**************************MY SOLUTION******************************/
public class Order {
    public static String order(String words) {
        if(words == "")
            return words;

        String[] order = words.split(" ");
        String[] str = words.split(" ");
        String result = "";
        int count = 1;

        for(int i = 0; i < str.length; i++)
            order[i] = order[i].replaceAll("[a-zA-Z]", "");

        while(count < str.length + 1){
            for(int i = 0; i < str.length; i++){
                if(count == Integer.parseInt(order[i])){
                    result += str[i] + " ";
                    break;
                }
            }
            count++;
        }

        return result.trim();
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
}
/*******************************************************************/