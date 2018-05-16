/**************************MY SOLUTION******************************/
public class Accumul {
    public static String accum(String s) {
        String result = "";
        int count = 1;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < count; j ++){
                result += j == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
            }

            if (i != s.length()-1) result += "-";
            count++;
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
public class Accumul {
    public static String accum(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
}
/*******************************************************************/