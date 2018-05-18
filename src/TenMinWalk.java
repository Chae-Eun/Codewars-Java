/**************************MY SOLUTION******************************/
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int count = 0;

        for(char i : walk) {
            switch (i) {
                case 'n':
                    count += 1;
                    break;
                case 's':
                    count -= 1;
                    break;
                case 'w':
                    count += 2;
                    break;
                case 'e':
                    count -= 2;
            }
        }

        return count == 0 && walk.length == 10 ? true : false;
    }
}

/************************BEST SOLUTION******************************/
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n':
                    y++;
                    break;
                case 'e':
                    x++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
/*******************************************************************/