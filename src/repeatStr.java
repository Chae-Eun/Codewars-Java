/**************************MY SOLUTION******************************/
public class repeatStr {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";

        for(int i = 0; i < repeat; i++)
            result += string;

        return result;
    }
}

/************************BEST SOLUTION******************************/
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }
}
/*******************************************************************/