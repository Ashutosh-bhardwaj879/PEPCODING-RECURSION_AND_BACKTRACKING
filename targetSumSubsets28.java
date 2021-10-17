import java.util.Scanner;

class main28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, target);
        scn.close();
    }

    public static void printTargetSumSubsets(int[] arr, int index, String set, int sos, int target) {
        if (index == arr.length) {
            if (sos == target) {
                System.out.println(set + ".");
            }
            return;
        }
        printTargetSumSubsets(arr, index + 1, set + arr[index] + ",", sos + arr[index], target);
        printTargetSumSubsets(arr, index + 1, set, sos, target);
    }
}