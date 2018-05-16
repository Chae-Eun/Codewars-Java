/**************************MY SOLUTION******************************/
public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase == "" || phrase == null)
            return null;

        int change = 0;
        String result = "";
        char[] ch = new char[100];

        for(int i = 0; i < phrase.length(); i++){
            if(i == 0 || change == 1) {
                ch[i] = Character.toUpperCase(phrase.charAt(i));
                change = 0;
            }
            else if(phrase.charAt(i) == ' '){
                ch[i] = phrase.charAt(i);
                change = 1;
            }
            else
                ch[i] = phrase.charAt(i);

            result += ch[i];
        }

        return result;
    }

}

/************************BEST SOLUTION******************************/
public class JadenCase {

    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) return null;

        char[] array = phrase.toCharArray();

        for(int x = 0; x < array.length; x++) {
            if(x == 0 || array[x-1] == ' ') {
                array[x] = Character.toUpperCase(array[x]);
            }
        }

        return new String(array);
    }

}
/*******************************************************************/