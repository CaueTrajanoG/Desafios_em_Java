package RemoteCar;

public class ElonsToyCar {
    private int batery = 100;
    private int meters;
    public static ElonsToyCar Buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        String metros = Integer.toString(this.meters);
        return "Driven "+metros+" meters";
    }
    public String batteryDisplay() {
        if(this.batery>0 ){
            String bateria = Integer.toString(this.batery);
            return "Battery at "+bateria+"%";
        }else{
            return "Battery empty";
        }
    }
    public void drive() {
        if(this.batery >0){
            this.meters = this.meters + 20;
            this.batery--;
        }
    }
}