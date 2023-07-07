package ch06;

class Cat1 {
    static int countCat = 0;
    String name;

    public Cat1() {
        this.name = "길고양이";
        Cat1.addCat();
    }

    public static void addCat() {
        Cat1.countCat++;
        System.out.println("새로운 고양이가 태어났습니다.");
    }

}

public class S04 {
    public static void main(String[] args) {

        new Cat1();
        new Cat1();
        new Cat1();
        new Cat1();
        new Cat1();
        System.out.println("고양이의 수는 " + Cat1.countCat);

    }
}
