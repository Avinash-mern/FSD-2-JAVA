class Main {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        int dummy = n;
        while(n != 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if(dummy % sum == 0){
            System.out.print(sum);
        }
        else{
            System.out.print("-1");
        }
    }
}
