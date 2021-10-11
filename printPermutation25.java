import java.util.Scanner;

class main25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutation(str, "");
        scn.close();
    }

    public static void printPermutation(String ques, String answer_so_far) {
        if (ques.length() == 0) {
            System.out.print(answer_so_far + " ");
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String left = ques.substring(0, i);
            String right = ques.substring(i + 1);
            String rest_of_ques = left + right;
            printPermutation(rest_of_ques, answer_so_far + ch);
        }
    }
}