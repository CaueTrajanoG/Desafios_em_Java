import java.util.Scanner;

public class AnalizarStrings{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();
         
        String levelDeErro;
        String codigoErro;
        if(texto.toLowerCase().contains("warning")){
            //warning
            levelDeErro = texto.toLowerCase().substring(1,8);
            codigoErro = texto.toLowerCase().substring(11);

        }else if(texto.toLowerCase().contains("error")){
            //error
            levelDeErro = texto.toLowerCase().substring(1, 6);
            codigoErro = texto.toLowerCase().substring(9);
        }else{
            //info
            levelDeErro = texto.toLowerCase().substring(1, 5);
            codigoErro = texto.toLowerCase().substring(8);
        }
        String saidaFormatada = codigoErro + " ("+ levelDeErro+")";
        saidaFormatada = saidaFormatada.substring(0,1).toUpperCase() + saidaFormatada.substring(1);
        System.out.println(saidaFormatada);
    }
}