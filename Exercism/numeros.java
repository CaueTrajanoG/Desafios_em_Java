public class numeros {
    public static void main(String[] args) {
        System.out.println(workingItemsPerMinute(5));


    }
    public static double productionRatePerHour(int speed) {
        if(speed==0){
            return 0;
        }else if(speed<4){
            return speed*211;
        }else if(speed<8){
            return speed*211*0.9;
        }else if(speed<9){
            return speed*211*0.8;
        }else{
            return speed*211*0.77;
        }
    }
    public static int workingItemsPerMinute(int speed){
        double valor = 0;
        //int valorInt = (int)valor;

        if(speed==0){
            return 0;
        }else if(speed<4){
            return speed*211/60;
        }else if(speed<8){
            valor = ((speed*211)/60)*0.9;
            System.out.println(valor);
            valor = Math.round(valor);
            System.out.println(valor);
            int valorInt = (int)valor;
            return valorInt;
        }else if(speed<9){
            valor = speed*211/60*0.8;
            int valorInt = (int)valor;
            return valorInt;
        }else{
            valor = speed*211/60*0.77;
            int valorInt = (int)valor;
            return valorInt;
        }
    }
}
