import java.util.Scanner;

class main24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePathJump(1, 1, n, m, "");
        scn.close();
    }

    public static void printMazePathJump(int sr, int sc, int dr, int dc, String path_so_far) {
        if (sr == dr && sc == dc) {
            System.out.println(path_so_far);
            return;
        }
        // horizontal moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePathJump(sr, sc + ms, dr, dc, path_so_far + "h" + ms);
        }
        // vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePathJump(sr + ms, sc, dr, dc, path_so_far + "v" + ms);
        }
        // diagonal moves
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printMazePathJump(sr + ms, sc + ms, dr, dc, path_so_far + "d" + ms);
        }
    }
}