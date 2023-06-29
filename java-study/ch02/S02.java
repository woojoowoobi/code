package ch02;

public class S02 {
    public static void main(String[] args) {
        // String str = "저는 홍길동이고 25세입니다";
        String name = "지드레곤";
        int age = 34;

        // 문자열 사이에 변수를 넣고 싶을 때에는 문자열을 더해준다
        // 보기에 깔끔하지 않고 사용하기 불편하다
        String str1 = "저는 " + name + "이고 " + age + "세입니다";
        System.out.println(str1);
        
        
        // 형식화된 출력(printf)
        System.out.printf("저는 %s이고 %d세입니다\n", "고양이", 5);
        System.out.printf("\"저는 %s이고 %d세입니다\"\n", "고양이", 2);

        // 소수점 단위를 제한할 수 있다
        System.out.printf("%.2f\n", 10.0 / 3);
        // 잘린 소수점이 0.5이상이면 자동으로 반올림 된다
        System.out.printf("%.2f\n", 3.66666666);

        // 문자열 포맷팅 / 문자열 보간법
        String str2 = String.format("저는 %s\n", "홍길동");
        System.out.println(str2);

    }
}
