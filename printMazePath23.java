import java.util.Scanner;

class main23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        String path_so_far = "";
        printMazePaths(1, 1, n, m, path_so_far);
        scn.close();
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String path_so_far) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(path_so_far);
            return;
        }
        printMazePaths(sr, sc + 1, dr, dc, path_so_far + "h");
        printMazePaths(sr + 1, sc, dr, dc, path_so_far + "v");
    }
}