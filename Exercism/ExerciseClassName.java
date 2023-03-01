import java.util.Random;

public class ExerciseClassName {


    public static void main(String[] args) {
        Random gerador2 = new Random();
        System.out.println(gerador2.nextInt(25,27));

        String []robotName = new String[5];
        robotName[0] = randon();
        robotName[1] = randon();
        robotName[2] = Integer.toString(gerador2.nextInt(0,9));
        robotName[3] = Integer.toString(gerador2.nextInt(0,9));
        robotName[4] = Integer.toString(gerador2.nextInt(0,9));
        String var = robotName[0]+robotName[1]+robotName[2]+robotName[3]+robotName[4];
        System.out.println(var);
        System.out.println(gerador2.nextInt(8,9));

        System.out.println(var);
    }


    public static String randon() {
        Random gerador = new Random();
        int num = gerador.nextInt(23);

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
                return "A";
        }

    }
}
