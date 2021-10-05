
class main3{
    public static void main(String[] args) {
        printDecInc(5);
    }
    public static void printDecInc(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printDecInc(n-1);
        System.out.print("  " + n + " ");
    }
}