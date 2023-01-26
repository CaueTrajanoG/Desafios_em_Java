

import java.util.Random;

public class ExerciciosMatriz {   
    public static void main(String[] args) {
        int[][] m = new int[10][10];       
        Random x = new Random();        
        for(int i=0; i<10;i++){
            for(int j =0; j<10;j++){
                m[i][j]= x.nextInt(10);    
            }
        }
        int maiorL5 = m[4][0];
        System.out.println("1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10");
        System.out.println("-------------------------------------------");
        int menorL5 = m[4][0];
        int maiorC7 = m[0][7];
        int menorC7 = m[0][7];
        for(int i=0; i<10;i++){
            for(int j =0; j<10;j++){
                System.out.printf("%d - ", m[i][j]);
                
                if((m[4][j] > maiorL5) && (i==4)){
                    maiorL5 = m[4][j];                    
                }else if(m[4][j] < menorL5 && (i==4)){
                    menorL5 = m[4][j];
                }
                if((m[i][6] > maiorC7) && (j==6)){
                    maiorC7 = m[i][6];
                }else if(m[i][6] < menorC7){
                    menorC7 = m[i][6];
                }
            }
            System.out.println("linha "+ (i+1));
        }
        System.out.printf("%nO maior numero da linha 5 é %d e o menor é %d", maiorL5, menorL5);
        System.out.printf("%nO Maior numedo da coluna 7 é %d e o menor é %d", maiorC7, menorC7);
    }
}
