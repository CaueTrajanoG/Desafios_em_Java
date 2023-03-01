import java.math.BigInteger;

public class ContaGraos {
    public static void main(String[] args) {
        //System.out.println(grainsOnSquare(67));
        System.out.println(grainsOnBoard());
        //throw new IllegalArgumentException("Error 404");
    }
    public static BigInteger grainsOnSquare(int square){
        BigInteger grao = BigInteger.valueOf(1);
        BigInteger total = BigInteger.valueOf(1);
            if (square > 1 && square < 66) {
                System.out.println("Casa: " + (1) + ", graos: " + grao + " Total> " + total);
                for (int i = 2; i <= square; i++) {
                    grao = grao.add(grao);
                    total = total.add(grao);
                    System.out.println("Casa: " + (i) + ", graos: " + grao + " Total> " + total);
                }//for
            }else {
                throw new IllegalArgumentException("Fora de escopo");
            }
            return grao;
    }//grainsOnSquare
    public static BigInteger grainsOnBoard() {
        BigInteger grao = BigInteger.valueOf(1);
        BigInteger total = BigInteger.valueOf(1);
        for (int i = 2; i <= 64; i++) {
            grao = grao.add(grao);
            total = total.add(grao);
        }
        return total;
    }
}





