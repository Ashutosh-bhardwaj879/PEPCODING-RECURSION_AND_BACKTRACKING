import java.util.*;

class main15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> res = getSubSequence(str);
        System.out.println(res);
        scn.close();
    }

    public static ArrayList<String> getSubSequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> med = new ArrayList<String>();
            med.add("");
            return med;
        }
        char ch = str.charAt(0);
        ArrayList<String> recursion_result = getSubSequence(str.substring(1));
        ArrayList<String> result = new ArrayList<String>();
        for (String s : recursion_result) {
            result.add("" + s);
        }
        for (String s : recursion_result) {
            result.add(ch + s);
        }
        return result;
    }
}