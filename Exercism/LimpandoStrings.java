public class LimpandoStrings {


    public static void main(String[] args) {

        String palavra = "my\0Id lord of the rings";

        //System.out.println(clean(palavra));
        //toCamelCase(palavra);
        //texteString();
        onlyAlpha();
    }
    static String clean(String identifier) {
       String var = identifier.replace(" ", "_");
       var = var.replace("\0", "CTRL" );

       for(int i =0;i<var.length();i++){

       }
        return var;
    }
    //metodo camelCase
    public static String onlyAlpha(){

        String frase = "Frase de teste 01";
        String []word = frase.split(" ");
        String temporario = "";
        for(int j = 0;j < word.length; j++){
            for(int i = 0; i<word[j].length();i++){
                temporario += (word[j].charAt(i)+"").toUpperCase();
            }
        }
        System.out.println(temporario);
        return "";
    }
    
    /*
    static String texteString() {//função camel case funcionando
        String valor = "banana no pé";
        String []s= valor.split(" ");
        String temp="";
        String saida = "";
        for(int j = 0;j<s.length; j++){
                for(int i = 0; i<s[j].length();i++){
                    if(i==0){
                        if(j>0){
                            temp+= (s[j].charAt(i)+"").toUpperCase();
                        } else{temp += (s[j].charAt(i)+"").toLowerCase();}
                    }else{
                        temp += (s[j].charAt(i)+"").toLowerCase();
                    }
                }

        }
       System.out.println(temp);
        return saida;

    }*/



}



    


