public class condicionais {
    public static void main(String[] args) {
        
        //metodo main

        //int card = parseCard("");
        //System.out.println(card);
        System.out.println(isBlackjack("ace", "queen"));
    }
    public static int parseCard(String card) {
        switch(card){
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
                return 10;
            case "jack":
                return 11;
            case "queen":
                return 10;
            case "king":
                return 10;
            default:
                return 0;
        }

        
    }

    public static boolean isBlackjack(String card1, String card2) {
        if( (parseCard(card2)+parseCard(card1)) == 21){
            return true;
        }else{
            return false;
        }       
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack ==true && dealerScore <10){
            return "W";
        }else if(isBlackjack == true && dealerScore >= 10){
            return "S";
        }else{
            return "P";
        }
        
    }
    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17){
            return "S";
        }else if(handScore <= 11){
            return "H";
        }else if(handScore > 11 && dealerScore <7){
            return "S";
        }else{
            return "H";
        }
     }
     /*Categoria: mão pequena
        Se suas cartas somarem 17 ou mais, você deve sempre permanecer(return stand).
        Se suas cartas somam 11 ou menos, você deve sempre bater(return hit).
        Se suas cartas somam um valor dentro do intervalo [12, 16],você deve sempre ficar de pé (return stand),
         a menos que o dealer tenha um 7 ou mais,caso em que você deve sempre bater(return hit).
     */
        












}

