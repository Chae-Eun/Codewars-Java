/**************************MY SOLUTION******************************/
public class DRoot {
    public static int digital_root(int n) {
        String str = String.valueOf(n);
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(str.substring(i, i+1));
        }

        while(String.valueOf(sum).length() > 1)
            sum = digital_root(sum);

        return sum;
    }
}

/************************BEST SOLUTION******************************/
public class DRoot {
    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}

public class DRoot {
    public static int digital_root(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        return(n);
    }
}
/*******************************************************************/