import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler atandı
        int sayi, toplam = 0;

        //Kullanıcıdan veri almak için Scanner eklendi.
        Scanner inp = new Scanner(System.in);

        //Koşullar do-while ile belirlendi.
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = inp.nextInt();
            if ((sayi % 2 == 0 && sayi % 4 != 0) || sayi % 4 == 0) { // buradaki işlemin uzatmanın sebebi el alışkanlığı olması adına.
                toplam += sayi;  // Koşulu sağlayan sayılar toplama eklendi.
            }
        } while (sayi % 2 == 0);
        System.out.println("Toplam " + toplam);
    }
}