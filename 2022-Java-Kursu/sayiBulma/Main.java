package sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7 };
        int aranacakSayi = 1;
        boolean sayiVarMi = false;

        for (int sayi : numbers) {
            if (sayi == aranacakSayi) {
                sayiVarMi =true;
                break;
            }
        }

        if (sayiVarMi) {
            System.out.println("aradığınız sayı listede vardır.");
        } else
            System.out.println("aradığınız sayı listede yoktur.");
    }


}
