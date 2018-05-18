/**************************MY SOLUTION******************************/
public class findShort {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int length = arr[0].length();

        for (int i = 1; i < arr.length; i++)
            length = arr[i].length() < length ? arr[i].length() : length;

        return length;
    }
}

/************************BEST SOLUTION******************************/
import java.util.stream.*;
public class Kata {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
/*******************************************************************/