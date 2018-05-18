/**************************MY SOLUTION******************************/
public class Sum {
    public int GetSum(int a, int b) {
        if(a == b)
            return a;

        if(a < b)
            for(int i = a+1; i <= b; i++)
                a += i;
        else {
            for (int i = b+1; i <= a; i++)
                b += i;
            a = b;
        }

        return a;
    }
}

/************************BEST SOLUTION******************************/
public class Sum
{
    public int GetSum(int a, int b)
    {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
/*******************************************************************/