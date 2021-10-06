import java.util.Scanner;

class main11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int max_in_smaller_array = maxOfArray(arr, idx + 1);
        if (max_in_smaller_array > arr[idx]) {
            return max_in_smaller_array;
        } else {
            return arr[idx];
        }

    }
}
