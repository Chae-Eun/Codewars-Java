/**************************MY SOLUTION******************************/
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        String result = "";
        int[] strlen = new int[strarr.length];
        int sum = 0, tmp = 0, check = -1;

        if(strarr.length != 0 && k < strarr.length && k > 0){
            for (int i = 0; i < strarr.length; i++)
                strlen[i] = strarr[i].length();

            for (int j = 0; j < strlen.length+1-k; j++) {
                for (int p = 0; p < k; p++)
                    tmp += strlen[j + p];

                if(tmp > sum){
                    sum = tmp;
                    check = j;
                }

                tmp = 0;
            }

            for(int q = 0; q < k; q++)
                result += strarr[check + q];
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
/*******************************************************************/