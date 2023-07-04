package house;
import java.util.Arrays;

public class Home07 {
    public static void main(String[] args) {
    // ★무작위 가위바위보 만들기★
        String[] strArr = {"가위", "바위" ,"보"};
        System.out.println(Arrays.toString(strArr));


        for(int i = 0; i < 10; i++){
            int tmp = (int)(Math.random()*3);
        System.out.println(strArr[tmp]);
    }
    }
}
