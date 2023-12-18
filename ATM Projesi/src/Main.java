import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Değişkenler belirlendi.
        String userName, password;
        int hak = 3;
        int bakiye = 1500;
        int secim;
        int tutar=0;

        while (hak > 0) {
            System.out.print("Kullanıcı Adı :");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            //Kullanıcı adı ve şifre kontrolü
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                //İşlemler için döngü atandı.
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();

                    //Belirtilen seçimleri gerçekleştirmek için swtich koşulu atandı.
                    switch (secim){
                        case 1:
                            System.out.print("Para miktarı : ");
                            tutar = input.nextInt();
                            bakiye += tutar;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            tutar = input.nextInt();
                            if (tutar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= tutar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}