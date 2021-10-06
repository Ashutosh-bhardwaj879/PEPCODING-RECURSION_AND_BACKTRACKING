import java.util.Scanner;

class main10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrRev(arr, 0);
        scn.close();
    }

    public static void displayArrRev(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }
        displayArrRev(arr, n + 1);
        System.out.print(arr[n] + " ");
    }
}