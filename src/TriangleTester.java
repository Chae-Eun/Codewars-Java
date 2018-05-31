/**************************MY SOLUTION******************************/
class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        if(a >= b && a >= c) return a < b+c ? true : false;
        else if (b >= a && b >= c) return b < a+c ? true : false;
        else return c < a+b ? true : false;
    }
}

/************************BEST SOLUTION******************************/
class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;
    }
}
/*******************************************************************/