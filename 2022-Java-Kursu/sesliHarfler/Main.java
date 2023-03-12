package sesliHarfler;

public class Main {
    public static void main(String[] args) {
        char harf = 'p';
        switch (harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'U':
            case 'u':
            case 'O':
            case 'o':
                System.out.println("Kalın sesli harf girdiniz.");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ü':
            case 'ü':
            case 'Ö':
            case 'ö':
                System.out.println("İnce sesli harf girdiniz.");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz.");

        }

    }

}
