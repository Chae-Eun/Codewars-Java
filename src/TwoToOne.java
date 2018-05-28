/**************************MY SOLUTION******************************/
public class TwoToOne {
    public static String longest (String s1, String s2) {
        String result = "";

        for (int i = 97 ; i < 123; i++) {
            if (s1.contains("" + (char) i) || s2.contains("" + (char) i))
                result += (char) i;
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
public class TwoToOne {

    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
/*******************************************************************/