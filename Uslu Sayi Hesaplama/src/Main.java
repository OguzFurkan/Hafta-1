import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler atandı.
        int sayi, us;

        //Kullanıcıdan veri almak için Scanner eklendi.
        Scanner input = new Scanner(System.in);

        //Değişkenler scanner'a atanarak kullanıcıdan sayı ve üs alındı..
        System.out.print("Sayıyı girin: ");
        sayi = input.nextInt();
        System.out.print("Üssü girin: ");
        us = input.nextInt();

        // Üs alma işlemi için değişken atandı.
        int toplam = 1;

        for (int i = 1; i <= us; i++) {
            toplam *= sayi; //Her adımda sayıyı üs kadar çarpıp toplam değişkenine atandı.
        }
        System.out.print("Sonuc: " + toplam);
    }
}