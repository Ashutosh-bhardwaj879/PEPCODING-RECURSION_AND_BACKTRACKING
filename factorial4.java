class main4 {
    public static void main(String[] args) {
        System.out.println(factorial(5)); 
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fn1 = factorial(n - 1);
        int fn = n * fn1;
        return fn;
    }
}