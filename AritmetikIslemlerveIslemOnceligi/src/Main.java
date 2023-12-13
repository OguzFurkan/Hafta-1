import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Küsuratlı değerler girilmesini karşın değişkenler double ile atandı.
        double a, b, c;

        //Kullanıcıdan veri almak için scanner oluşturuldu.
        Scanner sayi = new Scanner(System.in);

        //Kullanıcıdan alınan değerler değişkenlere atandı.
        System.out.println("A değerini giriniz.");
        a = sayi.nextDouble();
        System.out.println("B değerini giriniz.");
        b = sayi.nextDouble();
        System.out.println("C değerini giriniz.");
        c = sayi.nextDouble();

        //İşlem net olduğu için final ile sabitlenip kullanılacak formül atandı.
        final double islem = a + (b * c) - b;
        System.out.println("Sonuç " + islem);


    }
}