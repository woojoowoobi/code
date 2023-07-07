package house;


    class Car {
        String color;
        String gearType;
        int door;
    
        Car(){
            this("white", "auto", 4); // 아래 생성자를 호출한다
        }
        Car(String c, String g, int d){
            this.color = c;
            this.gearType = g;
            this.door = d;
    
        }
    }   
    
    public class Home14 {
    public static void main(String[] args) {
    Car car = new Car(); // 클래스내에 매개변수 있는 성성자가 1개라도 있을 시 car(){} 클래스 내 생성자를 만들어준다
    // Car car = new Car("white", "auto", 4); 
        System.out.println(car.color);
        System.out.println(car.gearType);
        System.out.println(car.door);
}
    }