package house;

import java.util.Arrays;

public class Home08 {
    public static void main(String[] args) {
        // 01234
        String str = "ABCDE";
        char ch = str.charAt(2); // 2번에 있는 문자를 불러온다
        String str2 = str.substring(1, 4); // 1~4사이 문자열을 물러온다
        String str3 = str.substring(1); // 1~4 문자열 불러온다
        // String str3 = str.substring(1, str.length()); 위와 같은 내용
        System.out.println(str3);

    }
}
