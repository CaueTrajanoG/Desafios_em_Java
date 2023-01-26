import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Matriz {
    public static int days[] = {2, 5, 0, 7, 4, 1};// atributo principal da classe

    public static void main(String[] args) {

        System.out.println(getCountForFirstDays(333));
        

    }

    public static String getlastWeek() {// tarefa 1
        int lasWeek[] = { 0, 2, 5, 3, 7, 8, 4 };

        return Arrays.toString(lasWeek);
    }

    public static int getToday() {// tarefa 2
        if (days.length > 0) {
            return days[days.length - 1];
        } else {
            return 0;
        }

    }

    public static int incrementTodayCount() {// tarefa 3
        days[days.length - 1] += 1;
        return days[days.length - 1];
    }

    public static boolean hasDayWithoutBirds() {// tarefa 4
        Boolean dayWithOutBirds = false;
        for (Integer day : days) {
            if (day == 0) {
                dayWithOutBirds = true;
            }
        }
        return dayWithOutBirds;
    }

    public static int getCountForFirstDays(int cont) {// tarefa 5
        int soma = 0;
        if(cont > days.length){
            for (int i = 0; i < days.length ; i++) {
                soma += days[i];
            }
            return  soma;
        }
        for (int i = 0; i < cont; i++) {
            soma += days[i];
        }
        // System.out.println(soma);
        return soma;
    }

    public static int getBusyDays() {// terefa 6
        int busys = 0;
        for (Integer busyDay : days) {
            if (busyDay >= 5) {
                busys++;
            }
        }
        return busys;
    }

}
