public class convertToString {
    public static void main(String[] args) {


        System.out.println(convert(30));



    }
    public static String convert(int number) {
        String word = "";
        boolean signal = false;
        if(number%3==0){
            word = "Pling";
        }
        if(number%5==0 ){
            word +="Plang";
        }
        if(number%7==0){
            word+="Plong";
        }
        if(word.contains("P")){
            return word;
        }else {
            word = Integer.toString(number);
            return word;
        }
    }
}
