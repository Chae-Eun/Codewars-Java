/**************************MY SOLUTION******************************/
public class DnaStrand {
    public static String makeComplement(String dna) {
        String result = "";

        for (int i = 0; i < dna.length(); i++) {
            if(dna.substring(i, i+1).equals("T") || dna.substring(i, i+1).equals("A"))
                result += dna.substring(i, i+1).equals("T") ? "A" : "T";
            else
                result += dna.substring(i, i+1).equals("C") ? "G" : "C";
        }

        return result;
    }
}

/************************BEST SOLUTION******************************/
public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }

        return new String(chars);
    }

    private static char getComplement(char c) {
        switch(c) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }
}
/*******************************************************************/