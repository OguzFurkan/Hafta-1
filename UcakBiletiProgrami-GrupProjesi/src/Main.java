import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yolculukTipi;
        double km, yas, ucret = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz: ");
        km = input.nextDouble();

        System.out.print("Yaşınızı girin: ");
        yas = input.nextDouble();

        System.out.println("Yolculuk tipini seçiniz(Tek yön = 1 / Gidiş - Dönüş =2):");
        yolculukTipi = input.nextInt();

        if (km <= 0 || yas <= 0 || yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            double tutar = km * ucret;
            if (yas < 12) {
                tutar *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                tutar *= 0.9;
            } else if (yas >= 65) {
                tutar *= 0.7;
            }
            if (yolculukTipi == 2) {
                tutar *= 1.6;
            }
            System.out.println("Ödencek Tutar " + tutar);
        }
    }
}