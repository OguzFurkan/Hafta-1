import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler Eklendi.
        int sayi1, sayi2;

        //Scanner eklenerek değişkenler scanner'a atandı.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin: ");
        sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı Girin: ");
        sayi2 = input.nextInt();

        //Döngülerde kullanılacak değişkenler belirlendi.
        int i = 1;
        int ebob = 0;

        //ilk girilen sayının ikincisinden küçük olma durumunda gerçekleşecek döngü oluşturuldu.
        if (sayi1 <= sayi2) {
            while (i <= sayi1) {
                i++;
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob += i;
                }
            }
            //İkinci girilen sayının ikincisinden küçük olma durumunda gerçekleşecek döngü oluşturuldu.
        } else  {
            while (i <= sayi2) {
                i++;
                if (sayi2 % i == 0 && sayi1 % i == 0) {
                    ebob += i;
                }
            }
        }
        System.out.println("Girilen sayıların EBOB'u " + ebob);

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EKOK'u " + ekok);
    }
}