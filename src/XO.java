/**************************MY SOLUTION******************************/
public class XO {
    public static boolean getXO (String str) {
        int count_o = 0, count_x = 0, index = -1;

        while ((index = str.toLowerCase().indexOf("o", index + 1)) > -1)
            count_o++;
        while ((index = str.toLowerCase().indexOf("x", index + 1)) > -1)
            count_x++;

        return count_o == count_x ? true : false;
    }
}

/************************BEST SOLUTION******************************/
public class XO {
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
}
/*******************************************************************/