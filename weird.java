// Online Java Compiler


import java.util.*;

class Main {
    public static void main(String[] args) {
        //Weird Algo
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        while(x!=1){
        if(x % 2 == 0){
            System.out.print(x/2 + " ");
            x = x/2;
        }
        else{
            System.out.print(3*x + 1 + " ");
            x = 3*x + 1;
        }
        }
        
    }
}
