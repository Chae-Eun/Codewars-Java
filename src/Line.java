/**************************MY SOLUTION******************************/
public class Line {
    public static String Tickets(int[] peopleInLine) {
        int m25 = 0, m50 = 0, m100 = 0;

        for (int i = 0; i < peopleInLine.length; i++){
            switch (peopleInLine[i]){
                case 100:
                    if(m50 >= 1&& m25 >= 1){
                        m100 += 1;
                        m50 -= 1;
                        m25 -= 1;
                    } else if(m25 >= 3) {
                        m100 += 1;
                        m25 -= 3;
                    } else
                        return "NO";
                    break;
                case 50:
                    if(m25 >= 1) {
                        m50 += 1;
                        m25 -= 1;
                    } else
                        return "NO";
                    break;
                case 25:
                    m25 += 1;
                    break;
            }
        }

        return "YES";
    }
}

/************************BEST SOLUTION******************************/
public class Line {
    public static String Tickets(int[] peopleInLine){
        int bill25 = 0, bill50 = 0;
        for (int payment : peopleInLine){
            if(payment==25){
                bill25++;
            } else if(payment==50){
                bill25--;
                bill50++;
            } else if(payment==100){
                if(bill50>0){
                    bill50--;
                    bill25--;
                } else{
                    bill25-=3;
                }
            }
            if(bill25<0 || bill50 <0){
                return "NO";
            }
        }
        return "YES";
    }
}
/*******************************************************************/