package miniProjeAsalSayi;


public class Main {
    public static void main(String[] args) {
        /*         Scanner s = new Scanner(System.in);
         System.out.print("Bir sayı giriniz: ");
         int n =s.nextInt();
         
         
         int summ= 1 ;
         for(int i=2 ; i <= n/2 ; i++){
         if(n% i == 0)
         summ += i;
         
        }
        System.out.println(summ == 1 ? "asal sayı " : "asal sayı değil");
        */
        int number=201 ;
        boolean isPrime=true;

        if(number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if(number<2){
            System.out.println("Geçersiz sayı girdiniz");
        }
                
        if(number<2){
            System.out.println("Geçerisiz sayı");}
        for(int i =2 ;i<number;i++){
           if( number % i == 0 ){
             isPrime =false ;
            }
        }

        if(isPrime){
            System.out.println("Sayı asaldır.");
        
        }else
            System.out.println("Sayı asal değildir.");
    

    }
    
}
