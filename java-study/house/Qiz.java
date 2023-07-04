package house;
import java.util.Scanner;

public class Qiz {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "lie", "거짓말" },
                { "mom", "엄마" },
                { "father", "아빠" },
        };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%n%nQ%d. %s의 뜻은?", i + 1, words[i][0]);
            String tmp = sc.nextLine();
            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.정답은 %s입니다.", words[i][1]);
            }
        }
    }
}
