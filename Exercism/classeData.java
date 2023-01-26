import java.util.Calendar;
import java.util.Date;

public class classeData {
    public static void main(String[] args) {
        
        
        Date date = new Date();
        Calendar hoje = Calendar.getInstance(); //singleton
        //System.out.println(hoje);        
        
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH);
        int ano = hoje.get(Calendar.YEAR);
        System.out.printf("São %02d:%02d:%02d ",hora,minutos,segundos);
        
        System.out.printf("%nData de hoje: %02d/%02d/%02d", dia,(mes +1),ano);
    }
}
