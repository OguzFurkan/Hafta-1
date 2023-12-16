import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double toplam = 0, bolunenler = 0, ortalama;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();

        System.out.print("3 ve 4'e bölünen sayılar: ");

        // Kullanıcıdan alınan sayıya kadar kontrol ederek topla ve bölen sayıları arttır.
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                bolunenler++;

                System.out.print(i + " ");
            }
        }
        // Çıktılar arası boşluk bırakmak için
        System.out.println();

        // Bölünebilen sayı varsa ortalama işlemi gerçekleştirmek için
        if (bolunenler > 0) {
            ortalama = toplam / bolunenler;
            System.out.println("3 ve 4'e bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e bölünen sayı bulunamadı.");
        }
    }
}