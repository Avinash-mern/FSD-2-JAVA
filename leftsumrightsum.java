import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int ls = 0;
        int rs = 0;
        for(int i = 0; i<(size/2); i++){
            ls = ls + arr[i];
        }
        for(int i = (size/2); i<size; i++){
            rs = rs + arr[i];
        }
        System.out.print("Product of Left sum and right sum is : " + (ls*rs));
        
    }
}
