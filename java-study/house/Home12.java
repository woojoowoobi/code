package house;

public class Home12 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L, 300L)); 
        // ★클래스 메서드 호출 (클래스명.메서드이름),호출시 객체생성 필요없음★
        MyMath2 mm = new MyMath2(); // 인스턴스(객체) 생성
        mm.a = 200L;
        mm.b = 300L;
        System.out.println(mm.add());
        System.out.println(MyMath2.add1(200L, 300L));


    }
}
    class MyMath2 {
        long a, b;
        
        long add() {
            return a + b;
        }


        static long add(long a, long b){  //클래스 메서드 (static 메서드)
            return a + b;
        }
        static long add1(long a, long b){  //클래스 메서드 (static 메서드)
            return a * b;
        }
    }



