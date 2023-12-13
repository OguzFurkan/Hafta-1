import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler belirlendi.
        double kg, boy, vki;

        //Kullanıcadan vki'yi hesaplamak için veriler alındı.
        Scanner veri = new Scanner(System.in);

        //Kullanıcın girdiği veriler ile değişkenler atandı.
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = veri.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = veri.nextDouble();
        vki = kg / (boy * boy);

        System.out.println("Vucüt Kitle Indeksiniz : " + vki);


    }
}