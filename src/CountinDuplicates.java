public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String str = "", dup = "";
        int count = 0;

        text = text.toLowerCase();

        for(int i = 0; i < text.length(); i++){
            if(str.indexOf(text.charAt(i)) != -1) { // duplicate
                if(dup.indexOf(text.charAt(i)) == -1) { // not counting
                    dup = dup + text.charAt(i);
                    count++;
                }
                else // already counting
                    continue;
            }
            else // not duplicate
                str = str + text.charAt(i);
        }

        return count;
    }
}