/**************************MY SOLUTION******************************/
public class NumberFun {
    public static long findNextSquare(long sq) {
        return Math.sqrt((double)sq)%1 == 0 ? (long) Math.pow(Math.sqrt((double)sq)+1, 2) : -1;
    }
}

/************************BEST SOLUTION******************************/
public class NumberFun {
    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }
}
/*******************************************************************/