public class dardoAoAlvo {
    public static void main(String[] args) {
        System.out.println(score(0,0));
    }
    public static int score(int xOfDart, int yOfDart) {
        int squareX = xOfDart * xOfDart;
        int squarey = yOfDart * yOfDart;
        int squareOfHypo = squareX + squarey;
        double hypo = Math.sqrt(squareOfHypo);
        System.out.println(hypo);
        int var = (int) hypo;
        if(hypo > 10){
            return 0;
        }else if(hypo > 5){
            return 1;
        }else if(hypo > 1){
            return 5;
        }else{
            return 10;
        }
    }
}
