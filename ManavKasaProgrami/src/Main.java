import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //değişkenler küsuratlı olduğu için double ile oluşturulup atandı.
        double armutTl = 2.14;
        double elmaTl = 3.67;
        double domatesTl = 1.11;
        double muzTl = 0.95;
        double patlicanTl = 5.00;

        //Kullanıcıdan veri almak için Scanner atandı.
        Scanner kg = new Scanner(System.in);

        //Kg hesabı yapabilmek için kg değişkenleri oluşturulup kullanıcıdan veriler istendi.
        System.out.print("Kaç kilo armut?: ");
        double armutKg = kg.nextDouble();
        System.out.print("Kaç kilo elma?: ");
        double elmaKg = kg.nextDouble();
        System.out.print("Kaç kilo domates?: ");
        double domatesKg = kg.nextDouble();
        System.out.print("Kaç kilo muz?: ");
        double muzKg = kg.nextDouble();
        System.out.print("Kaç kilo patlıcan?: ");
        double patlicanKg = kg.nextDouble();

        // Toplam tutarı hesaplamak için işlemler yapıldı.

        double toplamTutar = (armutTl * armutKg) + (elmaTl * elmaKg) + (domatesTl * domatesKg)
                + (muzTl * muzKg) + (patlicanTl * patlicanKg);

        // Sonuç bastırıldı.
        System.out.println("Toplam Tutar " + toplamTutar + " TL");


    }
}
