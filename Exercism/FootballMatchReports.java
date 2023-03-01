public class FootballMatchReports {

    public static void main(String[] args) {

        System.out.println(report(13));



    }
    public static String report(int number) {
        if(number>0 && number<=11){
            switch (number) {
                case 1:
                    return "goalie";
                case 2:
                    return "left back";
                case 3:
                    return "center back";
                case 4:
                    return "center back";
                case 5:
                    return "right back";
                case 6:
                    return "midfielder";
                case 7:
                    return "midfielder";
                case 8:
                    return "midfielder";
                case 9:
                    return "left wing";
                case 10:
                    return "striker";
                case 11:
                    return "right wing";
            }
        }else{
            throw new IllegalArgumentException();
        }return"";
    }
}
