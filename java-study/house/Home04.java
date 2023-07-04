package house;
public class Home04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){// 괄호 {} 안의 문장을 5번 반복
        System.out.println("i="+i);
        } 
        // 변수가 for문에 묶여있으면 괄호안에서 다시 사용할수 없다
        // 초기화를 밖으로 뺴주면 사용 가능
        }
    }
    // public static void main(String[] args) {
    //    int i=1;  
    //    for (;;){
    //     System.out.println("i="+i);
    // }
    // scope (범위) - 변수는 선언위치부터 선언된 블럭의 끝까지
    // 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
    // 변수가 for문에 묶여있으면 괄호안에서 다시 사용할수 없다
    // 초기화를 밖으로 뺴주면 사용 가능
    // }

