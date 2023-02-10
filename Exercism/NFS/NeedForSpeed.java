package NFS;
public class NeedForSpeed {
    private int speed;
    private int battery;
    public int distanceDriven;
    public int batteryCost;

    public NeedForSpeed(int speed, int batteryCost) {
        this.speed = speed;
        this.batteryCost = batteryCost;
        this.distanceDriven =0;
        this.battery = 100;
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

        public boolean batteryDrained() {
            if(this.battery >= batteryCost ){
                return false;
            }else{
                return true;
            }
        }
        public int distanceDriven() {

            return this.distanceDriven;
        }

        public void drive() {
            if(this.battery >= batteryCost ){
                this.distanceDriven += this.getSpeed();
                this.battery -= this.batteryCost;
            }
        }
        public int getSpeed(){
            return speed;
        }
        public void setSpeed(int speed){
            this.speed = speed;
        }

    }
    class RaceTrack {
        // TODO: define the constructor for the 'RaceTrack' class
        private int distance;
        public RaceTrack(int dist){
            this.distance = dist;
        }
        public int getDistance(){

            return this.distance;
        }
        public boolean tryFinishTrack(NeedForSpeed car) {
            while(!car.batteryDrained()){
                car.drive();
                if(car.distanceDriven() >= getDistance()){
                   // System.out.println(car.distanceDriven());
                    return true;
                }
            }
            //System.out.println(car.distanceDriven());
            return false;
        }
    }


