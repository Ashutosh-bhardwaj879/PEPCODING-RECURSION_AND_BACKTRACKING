import java.util.*;

class main19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        printSubSequence(ques, "");
        scn.close();
    }

    public static void printSubSequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String rest_of_ques = ques.substring(1);

        printSubSequence(rest_of_ques, ans + ch);
        printSubSequence(rest_of_ques, ans + "");
    }
}