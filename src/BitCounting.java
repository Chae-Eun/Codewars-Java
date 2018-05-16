/**************************MY SOLUTION******************************/
public class BitCounting {
    public static int countBits(int n){
        String s = Integer.toBinaryString(n);
        int count = 0;

        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '1') count++;

        return count;
    }
}

/************************BEST SOLUTION******************************/
public class BitCounting {
    public static int countBits(int n){
        return Integer.bitCount(n);
    }
}
/*******************************************************************/