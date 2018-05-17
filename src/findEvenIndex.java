/**************************MY SOLUTION******************************/
public class findEvenIndex {
    public static int findEvenIndex(int[] arr) {
        int left, right, index = -1;

        for (int i = 0; i < arr.length; i++){
            left = 0; right = 0;
            for(int j = i-1; j >= 0; j--)
                left += arr[j];
            for(int j = i+1; j < arr.length; j++)
                right += arr[j];

            if(left == right){
                index = i;
                break;
            }
        }

        return index;
    }
}
/************************BEST SOLUTION******************************/
import java.util.Arrays;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
/*******************************************************************/