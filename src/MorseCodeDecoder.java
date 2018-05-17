/**************************MY SOLUTION******************************/
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] s = morseCode.split(" ");
        String result = "";

        for(int i = 0; i < s.length; i++)
            result += s[i].equals("") != true ? MorseCode.get(s[i]) : " ";

        return result.replaceAll("( )+", " ").trim();
    }
}

/************************BEST SOLUTION******************************/
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result += MorseCode.get(letter);
            }
            result += ' ';
        }
        return result.trim();
    }
}
/*******************************************************************/