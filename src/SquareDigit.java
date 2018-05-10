/**************************MY SOLUTION******************************/
public class SquareDigit {
    public int squareDigits(int n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] arr = new int[100];

        for (int i = 0; i < len; i++){
            arr[i] = str.charAt(i) - 48;

            if(arr[i] == 0 || arr[i] == 1)
                continue;
            else
                arr[i] = arr[i] * arr[i];
        }

        str = "";

        for (int j = 0; j < len; j++){
            str += arr[j];
        }

        n = Integer.parseInt(str);

        return n;
    }
}

/************************BEST SOLUTION******************************/
public class SquareDigit {
    public int squareDigits(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }
}
/*******************************************************************/
