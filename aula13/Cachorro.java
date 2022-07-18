package aula13;

public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au au au");
    }
    public void reagir(String frase){
        if(frase.equals("comida") ||frase.equals("xanin")){
            System.out.println("Abana");
        }else{System.out.println("Late");}
    }
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("GRRR");
        }else if(hora >18 ){
            System.out.println("Faz nada");
        }else{System.out.println("GRRRRR");}
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Fica feliz");
        }else{System.out.println("morde");}
    }
    public void reagir(int idade, float peso){
        if(idade > 7){
            System.out.println("Nem levanda");
        }else{
            System.out.println("Brinca");
        }
    }
}
