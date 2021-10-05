class main7 {
    public static void main(String[] args) {
        printZigZag(2);
    }

    public static void printZigZag(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("PRE " + n);
        printZigZag(n - 1);
        System.out.println("IN " + n);
        printZigZag(n - 1);
        System.out.println("POST " + n);
    }
}