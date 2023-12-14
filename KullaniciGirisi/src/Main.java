import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // String değişkenler belirlendi
        String userName, password;

        //Kullanıcıdan veri almak için scanner oluşturulup değişkenlerle eşlendi.
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        //Giriş için öncelikli koşullar eklendi.
        if (userName.equals("patika") && password.equals("plus123")) {
            System.out.println("Giriş yapıldı.");
            //Şifrenin hatalı olması durumunda sıfırlama sorusu yöneltildi.
        } else if (userName.equals("patika") && !password.equals("plus123")) {
            System.out.println("Hatalı şifre girdiniz. Şifrenizi sıfırlamak istiyorsanız 'evet' yazın.");
            String answer = input.nextLine();
            //Yeni şifre talebi oluşturuldu. Yeni şifre için değişken oluşturuldu.
            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword = input.nextLine();
                //Yeni şifre, eski şifre olmayacak şekilde eşitlendi.
                if (!newPassword.equals("plus123")) {
                    System.out.println("Yeni şifreniz oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        } else {
            System.out.println("Bilgilerinizi kontrol edin!");
        }

    }

}
