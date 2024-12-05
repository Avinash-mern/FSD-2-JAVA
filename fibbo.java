class Main {
    public static void main(String[] args) {
        int n = 5;
        //1 1 2 3 5
        
        int ft = 1;
        int st = 1;
        int sum = 0;
        for(int i = 3; i<=n; i++){
            sum = ft+st;
            ft = st;
            st = sum;
        }
        System.out.print(sum);
    }
}
