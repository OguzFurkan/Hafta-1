import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Kullanıcıdan hesaplanacak kombinasyon için değerler alındı.
        System.out.print("n değeri giriniz: ");
        int n = input.nextInt();
        System.out.print("r değeri giriniz: ");
        int r = input.nextInt();

        // r'nin n'den büyük olmama koşulu hesaplandı.
        if (r > n || r < 0) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            // Faktoriyel heasaplamalarını atamak için değişkenler belirlendi.
            int totalN = 1, totalR = 1, totalK = 1;

            for (int i = 1; i <= n; i++) {
                totalN *= i;
            }
            for (int i = 1; i <= r; i++) {
                totalR *= i;
            }
            int k = n - r;
            for (int i = 1; i <= k; i++) {
                totalK *= i;
            }

            // sonuc değişkenine kombinasyon formülü atandı.
            int sonuc = totalN / (totalR * totalK);
            System.out.println("Kombinasyon: " + sonuc);
        }
    }
}