import java.util.Scanner;

class class8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String t1 = scn.nextLine();
        String t2 = scn.nextLine();
        String t3 = scn.nextLine();
        towerOfHanoi(n, t1, t2, t3);
        scn.close();
    }

    public static void towerOfHanoi(int n, String t1, String t2, String t3) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, t1, t3, t2);// moving n-1 disks form t1 to t3 using t2
        System.out.println(n + " [ " + t1 + " -> " + t2 + " ] ");
        towerOfHanoi(n - 1, t3, t2, t1);// move n-1 disks from t3 to t2 using t1
    }
}