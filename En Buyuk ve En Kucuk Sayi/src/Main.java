import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int enBuyuk = 0;
        int enKucuk = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int girilenSayi = input.nextInt();

        //En büyük ve en küçük sayıları bulmak için koşul ve döngüler oluşturuldu.
        for (int i = 1; i <= girilenSayi; i++){
            System.out.print("Sayıları Giriniz: ");
            int sayilar = input.nextInt();

            if(sayilar < enKucuk || enKucuk == 0){
                enKucuk = sayilar;

            }if (enBuyuk < sayilar){
                enBuyuk = sayilar;
            }

        }

        System.out.println("En büyük sayı: " + enBuyuk + "\nEn küçük sayı: " + enKucuk);

    }
}