import java.util.*;

class main18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sc == dc && sr == dr) {
            ArrayList<String> baseCase = new ArrayList<String>();
            baseCase.add("");
            return baseCase;
        }
        ArrayList<String> hpaths = new ArrayList<String>();

        ArrayList<String> vpaths = new ArrayList<String>();

        ArrayList<String> result = new ArrayList<String>();

        if (sc < dc) {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }
        for (String hpath : hpaths) {
            result.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            result.add("v" + vpath);
        }
        return result;
    }

}