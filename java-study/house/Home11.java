package house;

public class Home11 {
    public static void main(String[] args) {
        myMath dd = new myMath();
        // long result1 = mm.add(5L, 3L);
        // long result2 = dd.Max(3L, 5L);
        dd.printGugudan(2);
        // System.out.println(result2);

    }
}

class myMath {
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        // 반환 타입이 void면 return 생략 가능
        }
    }

    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; // 위 두줄을 이와 같이 한줄로 할 수 잇다
    }

    long Max(long a, long b) {
        long result = 0;
        if (a > b) {
            result = a; // return = a;
        } else {
            result = b; // return = b;
        }
        return result;
        // 아래와 같음
        // result = a > b ? a : b;
        // return result;
        // 또는 아래와 같음
        // return a > b ? a : b;
    }
}
