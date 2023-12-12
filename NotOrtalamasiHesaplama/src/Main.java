import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak için scanner oluşturuldu.
        Scanner input = new Scanner(System.in);

        // Dersler int değişkeni ile atandı.
        int matematik, kimya, fizik, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu girin.");
        matematik = input.nextInt();

        System.out.print("Kimya notunuzu girin.");
        kimya = input.nextInt();

        System.out.print("Fizik notunuzu girin.");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu girin.");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu girin.");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin.");
        muzik = input.nextInt();

        // derslerin ortalaması küsuratlı olma durumundan dolayı sonuc değişkenininde double kullanıldı.
        int toplam = (matematik + kimya + fizik + turkce + tarih + muzik);
        double sonuc = (toplam / 6);

        // Boolean ile geçme koşulu test edildi.
        boolean basarisiz = (sonuc < 60);
        boolean basarili = (sonuc >= 60);

        //Duruma göre mesaj yazdırıldı.
        String ortalama = basarisiz ? "başarısız" : "başarılı!";
        System.out.println("Genel ortalamanız: " + sonuc + " ile " + ortalama);

    }
}