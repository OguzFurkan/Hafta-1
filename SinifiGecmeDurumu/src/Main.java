import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanılacak değişkenler belirlendi.
        int turkce, mat, fizik, kimya, muzik;

        //Kullanıcıdan veri almak üzere scanner oluşturuldu.
        Scanner not = new Scanner(System.in);

        //Girilen veriler değişkenlere atandı. İf koşuluyla girilen veriler 0-100 arasında değilse tekrar istendi
        System.out.print("Türkçe notunuz: ");
        turkce = not.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz not girdiniz! Lütfen sayfayı güncelleyip tekrar deneyin.");
            return;
        }
        System.out.print("Matematik notunuz: ");
        mat = not.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz not girdiniz! Lütfen sayfayı güncelleyip tekrar deneyin.");
            return;
        }
        System.out.print("Fizik notunuz: ");
        fizik = not.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz not girdiniz! Lütfen sayfayı güncelleyip tekrar deneyin.");
            return;
        }
        System.out.print("Kimya notunuz: ");
        kimya = not.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz not girdiniz! Lütfen sayfayı güncelleyip tekrar deneyin.");
            return;
        }
        System.out.print("Müzik notunuz: ");
        muzik = not.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not girdiniz! Lütfen sayfayı güncelleyip tekrar deneyin.");
            return;
        }

        // ortalama değişkeni ile ortalama alındı.
        int ortalama = (turkce + mat + fizik + kimya + muzik) / 5;

        //Sınıfı geçme şartları belirlenerek duruma göre geri bildirim yapıldı.
        if (ortalama < 55) {
            System.out.println("Üzgünüz, sınıfta kaldınız.");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: " + ortalama);

    }
}