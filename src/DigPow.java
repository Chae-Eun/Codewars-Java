/**************************MY SOLUTION******************************/
public class DigPow {
    public static long digPow(int n, int p) {
        String s = String.valueOf(n);
        long result = 0;

        for(int i = 0; i < s.length(); i++){
            result += Math.pow(Integer.parseInt(s.substring(i, i+1)), p);
            p++;
        }

        if(result%n == 0)
            return result/n;
        else
            return -1;
    }
}

/************************BEST SOLUTION******************************/
public class DigPow {

    public static long digPow(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }

}
/*******************************************************************/