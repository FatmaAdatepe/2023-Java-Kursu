package methods2;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün çok sıcak.";
        String newMessage = sehirVer();
        System.out.println(newMessage);
        int sayi = topla(17, 4);
        System.out.println(sayi);
        int toplam = topla(5, 7, 8,5);
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static String sehirVer() {
        return "Kahramanmaraş";
    }

    public static int topla(int... sayilar) {
        int total = 0;
        for (int numaralar : sayilar) {
            total += numaralar;
        }
        return total;
    }
}
