package SwitchCase;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : geçtiniz");
                break;
            case 'B':
                System.out.println("Çok iyi : geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default :
                System.out.println("Geçersiz not girdiniz.");
        }
    }

}
