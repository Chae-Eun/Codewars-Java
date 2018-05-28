/**************************MY SOLUTION******************************/
class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;

        while(p0 < p){
            p0 = (int) (p0 + (p0 * percent / 100) + aug);
            year++;
        }

        return year;
    }
}

/************************BEST SOLUTION******************************/
class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        if (p0>=p) return 0;
        else return nbYear((int) (p0+aug+p0*(percent/100)), percent, aug, p) + 1;
    }
}
/*******************************************************************/