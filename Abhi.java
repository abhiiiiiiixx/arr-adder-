import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Abhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("enter the length of arr1 :");
       int l1length = scanner.nextInt();
       int [] l1 = new int [l1length];
       for (int i = 0; i < l1length; i++) {
           System.out.print("num "+(i+1)+":" );
           l1[i] = scanner.nextInt();
       }

      System.out.print("enter the length of arr2 :");
       int l2length = scanner.nextInt();
       int [] l2 = new int [l2length];
       for (int j = 0; j < l1length; j++) {
           System.out.print("num "+(j+1)+":" );
           l2[j] = scanner.nextInt();
       }
       for (int k = 0; k < l1length; k++) {
           int[] result = new int[l1length+2];
           result[k] = l1[k] + l2[k];
           
            if(result[k]>10 && result[k]<20){
                for (int m = 0; m < 100; m++) {
                    if (result[k] == (10 + m)) {

                        result[k] = m;
                        l1[k + 1] = l1[k + 1] + 1;
                    }
                }
                
           }
            if(result[k]>20 && result[k]<30){
                for (int m = 0; m < 100; m++) {
                    if (result[k] == (20 + m)) {

                        result[k] = m;
                        l1[k + 1] = l1[k + 1] + 2;
                    }
                }
                
           }
           if (k == 0) {
               System.out.print("result = [");
           }System.out.print(result[k]);
           if(k<l1length-1){
               System.out.print(",");
           }
           if (k == l1length-1) {
               System.out.print("]");
           }
        }
        
     
       }

}
