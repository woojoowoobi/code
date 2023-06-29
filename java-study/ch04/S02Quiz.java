package ch04;

import java.util.Scanner;

public class S02Quiz {
    public static void main(String[] args) {
        // 점수를 입력 받아서
        // 90점 이상이면 A
        // 80점 이상이면 B
        // 70점 이상이면 C
        // 60점 이상이면 D
        // 60점 미만이면 F
        
        int nextInt = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 초기화 한다

        System.out.println("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        nextInt = scanner.nextInt();
       

        if (nextInt >= 90) {
            grade = 'A';
        } else if (nextInt >= 80) {
            grade = 'B';
        } else if (nextInt >= 70) {
            grade = 'C';
        } else if (nextInt >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("당신의 학점은 "+ grade +"입니다.");

        scanner.close();
    }
}
