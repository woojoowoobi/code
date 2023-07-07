package house;

class Home09 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        // Tv t = new Tv(); // 대체 가능
        t.channel =7;
        t.power();
        System.out.println("현재 채널은" + t.power + "입니다.");
        

    }
}

class Tv {
    //Tv의 속성 (멤버변수) (인스턴스변수 = iv, 단 앞에 static이 붙으면 클래스변수 =lv)
    String color;    // 색상 (인스턴스변수)
    boolean power;   // 전원상태 (인스턴스변수)
    int channel;     // 채널 (인스턴스변수)
    static int channel2; // 채널 (클래스변수)

    // Tv의 기능(메서드) (지역변수 = lv)
    void power() {power = !power;}  // Tv를 켜거나 끄는 기능
    void channelup() {++channel;}   // Tv를 채널업 기능
    void channelDown() {--channel;} // Tv를 채널다운 기능

}