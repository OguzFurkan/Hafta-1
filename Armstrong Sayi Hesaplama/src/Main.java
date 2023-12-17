import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //İlk olarak temel değişkenler belirlendi ve Scanner atandı.
        int sayi;
        int basamak = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin: ");
        sayi = input.nextInt();

        //Sayı değişkeni değişmesin diye temosayi adlı değişken ve hesaplama için sonuc değişkeni oluşturuldu.
        int tempSayi = sayi;
        int sonuc = 0;

        //Kaç Basamak olduğu hesaplandı.
        while (tempSayi != 0) {
            tempSayi /= 10;
            basamak++;
        }

        tempSayi = sayi; // tempSayi değişkenini diğer işlem için tekrar sayı ile eşitlendi.

        //Basamakların değerleri hesaplandı.
        while (tempSayi != 0) {
            basamak = tempSayi % 10;
            int us = 1;

            //Basamakların üssü alındı.
            for (int i = 1; i <= basamak; i++) {
                us *= basamak;
            }

            sonuc += us;
            tempSayi /= 10;

        }
        //Sonuç yazdırıldı.
        if (sonuc == sayi) {
            System.out.println(sayi + "Armstrong bir sayıdır.");
        } else {
            System.out.println(sayi + "Armstrong bir sayı değildir.");
        }
    }
}
