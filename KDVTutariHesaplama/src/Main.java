import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Değişkenler, tam sayı olmama durumuna karşı double ile atandı.
        double tutar, kdvOrani1, kdvOrani2, kdvTutari, kdvliTutar;

        //Kullanıcıdan tutar değişkenini almak için scanner atandı.
        Scanner deger = new Scanner(System.in);
        System.out.println("Hesağlamak istediğiniz değeri girin");
        tutar = deger.nextDouble();

        //Girilen tutara göre uygunlanacak şartlar belirlendi.
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani1 = 0.18;
            kdvTutari = tutar * kdvOrani1;
            kdvliTutar = tutar + kdvTutari;
            System.out.println("Girdiğiniz değerin KDV tutarı " + kdvTutari);
            System.out.println("Girdiğiniz değerin KDV'li hali " + kdvliTutar);
        } else if (tutar > 1000) {
            kdvOrani2 = 0.08;
            kdvTutari = tutar * kdvOrani2;
            kdvliTutar = tutar + kdvTutari;
            System.out.println("Girdiğiniz değerin KDV tutarı " + kdvTutari);
            System.out.println("Girdiğiniz değerin KDV'li hali " + kdvliTutar);
        } else {
            System.out.println("Geçerli değer girin!");
        }


    }
}
