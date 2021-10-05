import java.util.Scanner;

class main1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        decreasing(n);
        scn.close();
    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }
}