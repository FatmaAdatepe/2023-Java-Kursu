package mukemmelSAyilar;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int sayi =28;
        
        int bolen=0;
        for(int i =1;i<sayi;i++){
            if(sayi% i ==0){
                bolen =bolen +i;
            }
        }
        if(bolen==sayi)
            System.out.println("Mükemmel sayıdır.");
        else   
            System.out.println("Mükemmel sayı değildir.");
    }
}
