/**************************MY SOLUTION******************************/
public class HighAndLow {
    public static String HighAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int high = Integer.parseInt(arr[0]), low = Integer.parseInt(arr[0]);

        for(int i = 0; i < arr.length; i++){
            high = Integer.parseInt(arr[i]) > high ? Integer.parseInt(arr[i]) : high;
            low = Integer.parseInt(arr[i]) < low ? Integer.parseInt(arr[i]) : low;
        }

        return high + " " + low;
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}
/*******************************************************************/