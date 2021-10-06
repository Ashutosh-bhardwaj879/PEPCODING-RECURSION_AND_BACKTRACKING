import java.util.Scanner;

class main13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(lastIndex(arr, 0, d));
        scn.close();
    }

    public static int lastIndex(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }
        int liisa = lastIndex(arr, index + 1, x);
        if (liisa == -1) {
            if (arr[index] == x) {
                return index;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }

    }
}