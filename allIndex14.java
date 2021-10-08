import java.io.*;

class main14 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndex(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    // fsf = found so far
    public static int[] allIndex(int[] arr, int x, int index, int fsf) {

        if (index == arr.length) {
            return new int[fsf];
        }

        if (arr[index] == x) {
            int[] iarr = allIndex(arr, x, index + 1, fsf + 1);
            iarr[fsf] = index;
            return iarr;
        } else {
            int[] iarr = allIndex(arr, x, index + 1, fsf);
            return iarr;
        }
    }
}