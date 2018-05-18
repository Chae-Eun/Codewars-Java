/**************************MY SOLUTION******************************/
import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] arr = String.valueOf(num).split("");
        Arrays.sort(arr);

        for (int i = arr.length -2; i >= 0; i--)
            arr[arr.length-1] += arr[i];

        return Integer.parseInt(arr[arr.length-1]);
    }
}

/************************BEST SOLUTION******************************/
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
/*******************************************************************/