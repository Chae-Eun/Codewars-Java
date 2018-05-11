/**************************MY SOLUTION******************************/
public class FindOdd {
    public static int findIt(int[] A) {
        int odd = 0, count = 0;

        for(int i = 0; i < A.length; i++){
            odd = A[i];

            for(int j = 0; j < A.length; j++){
                if(odd == A[j])
                    count++;
            }

            if(count%2 == 1)
                break;
            else
                count = 0;
        }

        return odd;
    }
}

/************************BEST SOLUTION******************************/
public class FindOdd {
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
/*******************************************************************/