package RemoteCar;
public class main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.Buy();
        for(int i = 0;i<3;i++){
            car.drive();
            System.out.println(car.distanceDisplay());
        }
        System.out.println(car.batteryDisplay());
        System.out.println(car.distanceDisplay());

    }
}
