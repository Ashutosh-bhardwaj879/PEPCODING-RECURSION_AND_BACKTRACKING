class main6 {
    public static void main(String[] args) {
        System.out.println(powerLogarithmic(2, 4));
        System.out.println(powerLogarithmic(2, 5));
    }

    public static int powerLogarithmic(int b, int p) {
        if (p == 0) {
            return 1;
        }
        int bpd2 = powerLogarithmic(b, p / 2);
        int bp = bpd2 * bpd2;
        if (p % 2 != 0) {
            bp = b * bp;
        }
        return bp;
    }
}