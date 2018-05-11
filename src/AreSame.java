/**************************MY SOLUTION******************************/
import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null) {
            return false;
        }

        boolean result = false;
        int same = 0;

        if(a.length > 0 && b.length > 0){
            result = true;

            for (int i = 0; i < a.length; i++) {
                a[i] = Math.abs(a[i]);
            }

            Arrays.sort(a);

            for (int j = 0; j < b.length; j++){
                if(b[j] == 0){
                    same = Arrays.binarySearch(a, b[j]);
                }
                else if(Math.sqrt(b[j])%1 != 0){ // no integer
                    result = false;
                    break;
                }
                else{
                    same = (int) Math.sqrt(b[j]);
                    same = Arrays.binarySearch(a, same);
                }

                if(same >= 0) // find
                    continue;
                else{ // can not find
                    result = false;
                    break;
                }
            }
        }
        else if(b.length == 0)
            result = true;

        return result;
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;

public class AreSame {
    public static boolean comp(final int[] a, final int[] b) {
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }
}
/*******************************************************************/