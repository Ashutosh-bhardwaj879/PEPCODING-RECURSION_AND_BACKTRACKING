import java.util.Scanner;

class main9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArray(arr, 0);
        scn.close();
    }

    public static void displayArray(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }
        System.out.println(arr[n]);
        displayArray(arr, n + 1);

    }
}