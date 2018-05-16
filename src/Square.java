/**************************MY SOLUTION******************************/
public class Square {
    public static boolean isSquare(int n) {
        double result = Math.sqrt((double) n);

        if(result - (int) result == 0) return true;
        else return false;
    }
}

/************************BEST SOLUTION******************************/
public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}
/*******************************************************************/