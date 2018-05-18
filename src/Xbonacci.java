/**************************MY SOLUTION******************************/
import java.util.*;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        int count = 0;
        List<Double> tribon = new ArrayList<Double>();

        if (n == 0){
            return new double[]{};
        }
        else if(n <= s.length){
            double[] result = new double[n];

            while(count < n) {
                result[count] = s[count];
                count++;
            }

            return result;
        }
        else {
            for (double i : s)
                tribon.add(i);

            while (true) {
                tribon.add(tribon.get(count) + tribon.get(count + 1) + tribon.get(count + 2));
                count++;

                if (tribon.size() >= n) break;
            }

            double[] result = new double[tribon.size()];
            count = 0;
            while (count < result.length) {
                result[count] = tribon.get(count);
                count++;
            }

            return result;
        }
    }
}

/************************BEST SOLUTION******************************/
import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {

        double[] tritab=Arrays.copyOf(s, n);
        for(int i=3;i<n;i++){
            tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
        }
        return tritab;

    }
}
/*******************************************************************/