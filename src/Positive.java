/**************************MY SOLUTION******************************/
public class Positive{
    public static int sum(int[] arr){
        int sum = 0;

        for(int i : arr)
            if(i > 0)
                sum += i;

        return sum;
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;
public class Positive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
/*******************************************************************/