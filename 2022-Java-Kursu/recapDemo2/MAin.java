package recapDemo2;

public class MAin {
    public static void main(String[] args) {
        double[] myList ={1.5,2.8,3.2,4.6};
        double toplam=0;
        double max=myList[0];

        for(double number:myList){
            if(max<number)
                max=number ;
            toplam= toplam+number;
            System.out.println(number + " ");
            
        }
        System.out.println("Toplam : "+toplam);
        System.out.println("En büyük sayı  : "+max);
     }
    
}
