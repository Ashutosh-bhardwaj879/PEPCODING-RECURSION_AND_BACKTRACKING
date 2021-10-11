import java.util.*;

class main21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKeypadCombination(str, "");
        scn.close();
    }

    static String[] codes = { ",?", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

    public static void printKeypadCombination(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        char ch = ques.charAt(0);
        String rest_of_ques = ques.substring(1);

        String codeforch = codes[ch - '0'];

        for (int i = 0; i < codeforch.length(); i++) {
            char code = codeforch.charAt(i);
            printKeypadCombination(rest_of_ques, ans + code);
        }
    }
}