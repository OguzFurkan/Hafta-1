import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan alacağımız veriyi kullanmak için sayı değişkeni atandı.
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz sayıyı girin: ");
        sayi = input.nextInt();

        //Bölünen sayıların toplamını almak için toplam değişkeni 0 olarak atandı.
        int toplam = 0;

        //Koşullar for döngüsü ile sağlandı.
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        //if - else ile duruma göre çıktı alındı.
        if (toplam == (sayi * 2)) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}