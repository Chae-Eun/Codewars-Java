/**************************MY SOLUTION******************************/
class Persist {
    public static int persistence(long n) {
        int count = 0, sum = 1;

        if(n/10 == 0) // one-digit number
            return 0;

        while(n != 0){ // no one-digit number
            sum *= n%10;
            n = n/10;
        }

        count++;

        while(sum > 9){ // sum is not one-digit number
            sum = persistence(sum);
            count += sum;
        }

        return count;
    }
}

/************************BEST SOLUTION******************************/
class Persist {
    public static int persistence(long n) {
        long m = 1, r = n;

        if (r / 10 == 0)
            return 0;

        for (r = n; r != 0; r /= 10)
            m *= r % 10;

        return persistence(m) + 1;

    }
}

class Persist {
    public static int persistence(long n) {
        int times = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }
}
/*******************************************************************/