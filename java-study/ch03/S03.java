package ch03;

public class S03 {
    public static void main(String[] args) {
        
        short a = 1;
        short b = 2;
        short c = (short) (a + b);

        int num1 = 1000000;
        int num2 = -2000000;
        System.out.println(num1 * num2);
        // System.out.println((long)num1 * num2); (정답)
        // int 값의 +-21억 기준을 넘어서 long으로 행변환 해준다
    }
}
