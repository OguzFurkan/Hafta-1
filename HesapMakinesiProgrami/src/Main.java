import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler atandı.
        int number1, number2, select, result;

        //Kullanıcıdan veri almak için scanner atandı.
        Scanner input = new Scanner(System.in);

        //Girilen verilerle değişkenler eşitlendi.
        System.out.print("İlk sayıyı girin: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        number2 = input.nextInt();
        System.out.println("Bir seçim yapın\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();
        System.out.println("Lütfen seçiminizi yapın: " + select);

        //  Switch case ile koşullar belirlendi.
        switch (select) {
            case 1:
                result = (number1 + number2);
                System.out.println("İşleminizin sonucu: " + result);
                break;
            case 2:
                result = (number1 - number2);
                System.out.println("İşleminizin sonucu: " + result);
                break;
            case 3:
                result = (number1 * number2);
                System.out.println("İşleminizin sonucu: " + result);
                break;
            case 4:
                if (number2 != 0){
                    result = (number1 / number2);
                    System.out.println("İşleminizin sonucu: " + 4); //case'in içinde if komutu ile 0'a bölünmezlik yansıtıldı.
                }else {
                    System.out.println("Sayı sıfıra bölünmez!");
                }
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız!");

        }


    }
}