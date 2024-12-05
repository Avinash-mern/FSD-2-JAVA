// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        int nfact = 1;
        int rfact = 1;
        int diff = n-r;
        int nrfact = 1;
        for(int i = 1; i<=n; i++){
            nfact = nfact*i;
        }
        for(int i = 1; i<=r; i++){
            rfact = rfact*i;
        }
        for(int i = 1; i<=diff; i++){
            nrfact = nrfact*i;
        }
        System.out.print(nfact/(rfact*nrfact));
    }
}
