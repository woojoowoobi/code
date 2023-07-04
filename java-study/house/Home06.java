package house;
import java.util.Arrays;

public class Home06 {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        // System.out.println(arr.length);

        // for(int i=0;i<arr.length;i++){
        //     System.out.println("arr["+i+"]="+arr[i]);
        // }
        // int[] iArr = {100,95,80,70,60};
        // for(int i =0; i<iArr.length;i++)
        // System.out.println(iArr[i]);
        // System.out.println(Arrays.toString(iArr));
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));
        for(int i = 0; i < 100; i++){
         int n = (int)(Math.random()*10);
         int tmp = numArr[0];   
         numArr[0] = numArr[n];
         numArr[n] = tmp;  
        }
        System.out.println(Arrays.toString(numArr));

    }   
}
