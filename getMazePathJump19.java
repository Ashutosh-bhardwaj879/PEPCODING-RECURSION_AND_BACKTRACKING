import java.util.*;

class main19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePathJump(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    // sr = source rows
    // sc = source columns
    // dr = destination rows
    // dc = destination column
    public static ArrayList<String> getMazePathJump(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> paths = new ArrayList<String>();
        // for horizontal paths
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePathJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        // for vertical paths
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePathJump(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        // for diagnol paths
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMazePathJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}