import java.util.*;

class main17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> baseCase = new ArrayList<String>();
            baseCase.add("");
            return baseCase;
        } else if (n < 0) {
            ArrayList<String> baseCase = new ArrayList<String>();
            return baseCase;
        }
        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> result = new ArrayList<String>();
        for (String path : path1) {
            result.add(1 + path);
        }
        for (String path : path2) {
            result.add(2 + path);
        }
        for (String path : path3) {
            result.add(3 + path);
        }
        return result;
    }
}
