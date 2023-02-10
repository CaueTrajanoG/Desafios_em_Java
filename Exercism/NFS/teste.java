package NFS;

public class teste {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        var pista = new RaceTrack(100);

        System.out.println(pista.tryFinishTrack(car));


    }
}
