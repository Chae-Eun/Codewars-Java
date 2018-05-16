/**************************MY SOLUTION******************************/
class GetMiddle {
    public static String getMiddle(String word) {
        return word.length()%2 == 0 ? word.substring(word.length()/2-1, word.length()/2+1) : word.substring(word.length()/2, word.length()/2+1);
    }
}

/************************BEST SOLUTION******************************/
class Kata {
    public static String getMiddle(String word) {
        String s = "";
        int length = word.length();
        int half = length/2;

        if (length % 2 == 0) {

            s = word.substring(half - 1, half + 1);

        } else {

            s = word.substring(half, half + 1);

        }

        return s;
    }
}
/*******************************************************************/