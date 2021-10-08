import java.util.*;

class main16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        scn.close();
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseCase = new ArrayList<String>();
            baseCase.add("");
            return baseCase;
        }
        // 678
        char ch = str.charAt(0);// 6

        String rest_of_string = str.substring(1);// 78

        ArrayList<String> recursive_result = getKPC(rest_of_string);// 6 words of 78

        ArrayList<String> result = new ArrayList<String>();// 24 words of 678

        String codeforch = codes[ch - '0'];

        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String s : recursive_result) {
                result.add(chcode + s);
            }
        }
        /*
         * for (char codeforch : codes[ch-'0'].toCharArray()) 
            { 
                for(String s : recursive_result)
                    { 
                        result.add(cha + s); 
                    }     
           }
        */
        return result;
    }
}