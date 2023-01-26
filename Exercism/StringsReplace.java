public class StringsReplace {
    public static void main(String[] args) {

        String log = "carro";  
        String reverse ="";      
        for(int i = (log.length()-1) ;i >= 0;i--){            
            reverse = reverse + log.charAt(i);
        }  
        System.out.println(reverse);  
    }
}
