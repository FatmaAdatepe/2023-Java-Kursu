package stringDemo;

public class Main {
    public static void main(String[] args) {
        String message ="Bugün hava çok güzel.";
        System.out.println(message);
        System.out.println("Eleman sayısı:" +message.length());
        System.out.println("5.eleman : " +message.charAt(4));
        System.out.println(message.concat(" Yaşasın"));
        // değişkenimize yeni kelime keleyebiliriz.ancak başka bir değişkene
        // mesajımızın yeni halini eklemezsek eklediğimiz veri silinir.
        System.out.println(message.startsWith("B"));
        //değişkenin yazdığımız ifadeyle başlayıp başlamadığını gösterir.boolean ifade
        System.out.println(message.endsWith("."));
        //değişkenin yazdığımız ifadeyle bitip bitmediğini gösterir.boolean ifade
        System.out.println(message.indexOf("av"));
        //aradığımız verinin  baştan başlayıp ilk hangi indexte bulunduğunu gösterir.
        System.out.println(message.lastIndexOf("av"));
        //aradığımız verinin baştan başlayıp son olarak indexte bulunduğunu gösterir.
        char[] karakterler =new char [7];
        message.getChars(0, 5, karakterler, 0);
        /*getChar metodu ile bir metin içindeki ifadeyi alıp başka bir yere 
         * nakledebiliriz.ilk hangi karakteri alacağımız,son olarak hangi karakteri alacağımız
         * aldığımız karakterleri nereye atayacağımız,son olarakta atamaya listemizin hangi indexinden
         * başlayacağımızı seçiyoruz.
         */
        System.out.println(karakterler);

        String newMessage=message.replace(' ', '-');
        System.out.println(newMessage);
        //bu metod ile bir karakteri başka bir karakterle değiştirebiliriz.
        System.out.println(message.substring(2,5));
        //bu metos ile metin içinden istediğimiz uzunlukta bir parçayı alabiliriz.
        //bitiş indeksini yazmazsak metnin sonuna kadar alır.java'da sık kullanılır.

        for(String kelime :message.split(" ")){
            System.out.println(kelime);
        }
        /*Bir metni belirli bir karakter ya dakarakter dizinini dikkate alarak 
         * parçalamaya yarar.
         */

         System.out.println(message.toLowerCase());
         //metni tamamen küük harfe çevirir.
         System.out.println(message.toUpperCase());
         //metni tamamen büyük harfe çevirir.
         System.out.println(message.trim());
         //metnin başındaki sonundaki boşlukları yok eder.

    }
    
}
