package ch04;

import java.util.Scanner;

public class S02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();

        if (nextInt < 10) {
            System.out.println("숫자가 10보다 작습니다.");
        } else if (nextInt < 20) {
            System.out.println("숫자가 9보다 크고 20보다 작습니다");
        } else if (nextInt < 30) {
            System.out.println("숫자가 19보다 크고 30보다 작습니다");
        } else {
            System.out.println("숫자가 29보다 큽니다");
        }

    //     scanner.close();
    //     public static void main(String[] args) {

    //         Scanner scanner = new Scanner(System.in);
    //         int num = scanner.nextInt();

    //         if (num > 80) {
    //             System.out.println("합격입니다");
    //         }
    //         else if (num >= 80){
    //             System.out.println("예비합격입니다");
    //         }
    //         else {
    //             System.out.println("불합격입니다");
    //         }
    //     }
    }
}
