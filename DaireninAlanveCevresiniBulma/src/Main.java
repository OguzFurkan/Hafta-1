import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanılacak değişkenler belirlendi
        int r;
        double piSayisi = 3.14, alan, cevre;

        //Kullanıcıdan veri almak için Scanner atandı
        Scanner yaricap = new Scanner(System.in);

        //Değişkenlere değer atanarak işlem gerçekleştirildi.
        System.out.println("Dairenin yarıçapını girin");

        r = yaricap.nextInt();
        alan = piSayisi * (r * r);
        cevre = 2 * (piSayisi * r);

        System.out.println("Dairenin alanı " + alan);
        System.out.println("Dairenin çevresi " + cevre);
    }
}
