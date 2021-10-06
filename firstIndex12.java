import java.util.Scanner;

class main12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(firstIndex(arr, 0, d));
        scn.close();
    }

    public static int firstIndex(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            return index;
        } else {
            int fiisa = firstIndex(arr, index + 1, x);
            return fiisa;
        }
    }
}