

import java.util.*;

class Main {
    public static void main(String[] args) {
        //Maths library 
        int x = 5;
        int y = 1;
        int z = 10;
        int max = Math.max(Math.max(x,y) , Math.max(y,z));
        int min = Math.min(Math.min(x,y) , Math.min(y,z));
        System.out.print((x+y+z)-(max+min));
    }
}
