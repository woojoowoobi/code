package ch05;

import java.util.Arrays;

public class S04 {
    public static void main(String[] args) {
        String[] strArray = {"바나나", "사과", "멜론"};
        System.out.println(strArray.length);

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        // System.out.println(Arrays.toString(strArray)); 
        // for문 없이 바로 출력가능
    }
}
