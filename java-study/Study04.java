public class Study04 {
    // 함수
    // 반복적으로 사용하는 로직들을 하나로 모은 것
    // 함수명 printAdd
    // 소괄호 안의 데이터는 외부에서 받아오는 데이터
    public static void printAdd(int a, int b){
        System.out.println("계산을 시작합니다.");
        System.out.println(a + b);
        System.out.println("계산이 끝났습니다.");

    }
    


    public static void main(String[] args) {
       // 함수 사용 시 함수명을 적어주고 소괄호 안에 데이터를 넣어준다
        printAdd(a:3, b:2);
    }
}
