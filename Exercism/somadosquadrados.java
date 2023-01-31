public class somadosquadrados {
    public static void main(String[] args) {
        // (1 + 2 + ... + 10)² = 55² = 3025
        //1² + 2² + ... + 10² = 385
        int number = 10;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<=number;i++){ //Quadrado da soma
            sum1 += i;

            if(sum1!=0){
                //return sum1*sum1;
            }else{
                //return 1;
            }
            System.out.println(sum1*sum1);
        }

        for(int j=0;j<=number;j++){
            sum2 += j*j;
            System.out.println(sum2);
        }
    }
}
