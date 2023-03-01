package robot;
import java.util.Random;
public class Robot{
    private String name;
    public Robot() {
        this.name = nameFactor();
    }
    public String nameFactor(){
        Random gerador2 = new Random();
        String []robotName = new String[3];
        robotName[0] = randon();
        robotName[1] = randon();
        robotName[2] = Integer.toString(gerador2.nextInt(100,1000));
        String robotId = robotName[0]+robotName[1]+robotName[2];
        return robotId;
    }
    public static String randon() {
        Random gerador = new Random();
        int num = gerador.nextInt(1,30);
        switch (num) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            case 6:
                return "F";
            case 7:
                return "G";
            case 8:
                return "H";
            case 9:
                return "I";
            case 10:
                return "J";
            case 11:
                return "K";
            case 12:
                return "L";
            case 13:
                return "M";
            case 14:
                return "N";
            case 15:
                return "O";
            case 16:
                return "P";
            case 17:
                return "Q";
            case 18:
                return "R";
            case 19:
                return "S";
            case 20:
                return "T";
            case 21:
                return "U";
            case 22:
                return "V";
            case 23:
                return "W";
            case 24:
                return "X";
            case 25:
                return "Y";
            case 26:
                return "Z";
            default:
                return "Ç";
        }
    }
    public String getName(){
        return this.name;
    }
    public void reset(){
        this.name = nameFactor();
    }
}