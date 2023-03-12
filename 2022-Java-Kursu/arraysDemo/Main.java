package arraysDemo;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler =new String[4];
        ogrenciler [0]="Fatma";
        ogrenciler [1]="Tuba";
        ogrenciler [2]="Adem";
        ogrenciler [3]="Hacer";
        for(int i =0 ; i<ogrenciler.length;i++)
            System.out.println(ogrenciler[i]);
         System.out.println("----------------");

         for(String ogrenci:ogrenciler)
            System.out.println(ogrenci);


    }
    
}
