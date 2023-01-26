

import java.util.Scanner;

public class desafio{    
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de linhas: ");
        int num = teclado.nextInt();        
        System.out.println();

        for(int i = 0; i < num*2; i+=2){
            System.out.println(); 
            for(int esp = (num*2 -i); esp > 0; esp--){                
                System.out.print(" ");
            }           
            for(int j= 0; j <= i; j++){                
                System.out.print("* ");
            }
        }
        teclado.close();
    }
}