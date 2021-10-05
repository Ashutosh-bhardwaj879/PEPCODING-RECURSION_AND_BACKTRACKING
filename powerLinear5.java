class main5 {
    public static void main(String[] args) {
        System.out.println(powerLinear(2, 3));
    }

    public static int powerLinear(int b, int p) {
        if (p == 0) {
            return 1;
        }
        return b * powerLinear(b, p - 1);
    }
}