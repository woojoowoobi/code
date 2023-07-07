package house;

public class Home13 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.channel = 10;
        stv.channelup();
        stv.displayCaption("hello world");
        stv.caption = true;
        System.out.println(stv.channel);

    }
}
class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelup() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}