import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the element to find : ");
        int x = obj.nextInt();
        boolean check = false;
        for(int i = 0 ;i<size; i++){
            if(arr[i] == x){
                check = true;
                break;
            }
        }
        if(check == true){
            System.out.print("element is present");
        }
        else{
            System.out.print("Element is not present");
        }
        
    }
}
