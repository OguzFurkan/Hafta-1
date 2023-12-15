import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler belirlendi.
        int month, day;
        String burc = "";

        //Veri almak için scanner eklenip gün ve ay değişkenlerine atandı.
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı girin: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü girin: ");
        day = input.nextInt();

        //Ay ve gün değerlerinin aralığı belirlendi. Geçersiz veri girilmesi durumunda return ile çalışma durduruldu.
        if ((month < 1 || month > 12) || (day < 1 || day > 31)) {
            System.out.println("Hatalı giriş yaptınız!");
            return;
        }

        //İf koşulu ve mantıksaş operatörler ile burçların karşılık geldiği tarihlerin koşulları sağlandı.
        if ((month == 3 && day > 20) || (month == 4 && day <= 20)) {
            burc = "Koç";
        } else if ((month == 4 && day > 20) || (month == 5 && day <= 21)) {
            burc = "Boğa";
        } else if ((month == 5 && day > 21) || (month == 6 && day <= 22)) {
            burc = "İkizler";
        } else if ((month == 6 && day > 22) || (month == 7 && day <= 22)) {
            burc = "Yengeç";
        } else if ((month == 7 && day > 22) || (month == 8 && day <= 22)) {
            burc = "Aslan";
        } else if ((month == 8 && day > 22) || (month == 9 && day <= 22)) {
            burc = "Başak";
        } else if ((month == 9 && day > 22) || (month == 10 && day <= 22)) {
            burc = "Terazi";
        } else if ((month == 10 && day > 22) || (month == 11 && day <= 21)) {
            burc = "Akrep";
        } else if ((month == 11 && day > 21) || (month == 12 && day <= 21)) {
            burc = "Yay";
        } else if ((month == 12 && day > 21) || (month == 1 && day <= 21)) {
            burc = "Oğlak";
        } else if ((month == 1 && day > 21) || (month == 2 && day <= 19)) {
            burc = "Kova";
        } else if ((month == 2 && day > 19) || (month == 3 && day <= 20)) {
            burc = "Balık";
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
        System.out.println("Burcunuz: " + burc);
    }
}