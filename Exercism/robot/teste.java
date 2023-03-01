package robot;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class teste{
    public static void main(String[] args) {
        String []nomes = new String[5001];
        List<String> lista = Arrays.asList(nomes);
        int cont = 0;
        for(int i = 0; i<5000; i++){
            Robot newRobo = new Robot();
            if(lista.contains(newRobo.getName())){
                /*System.out.println("Robo clonado numero: "+ cont);
                System.out.println("name: "+ newRobo.getName());
                break;*/
                continue;
            }else{
                nomes[i]= newRobo.getName();
                cont++;
                System.out.println(cont+ ":  "+newRobo.getName());
            }
        }
        Random gerador = new Random();
    }
}