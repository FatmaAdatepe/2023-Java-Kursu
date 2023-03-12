package loopDemo;

public class Main {
    public static void main(String[] args) {
        //For döngüsü
        for(int i = 1 ; i<=10;i++)
            System.out.print(i+ " ");
        System.out.println("For Döngüsü bitti.");
        int i =1 ;
        while(i<10){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("While Döngüsü bitti.");
        int j =23;
        do{
            System.out.println(j);
            j +=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü bitti.");
    }
    
}
