import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler belirlendi
        double x;
        int y;

        //Scanner eklenerek değişkenler scanner'a atandı.
        Scanner input = new Scanner(System.in);
        System.out.print("Ondalıklı sayı giriniz: ");
        x = input.nextDouble();
        System.out.print("Tam sayı giriniz: ");
        y = input.nextInt();

        //Sout içinde tip dönüşümü ile İNT değeri double, double değeri ise İNT alındı.
        System.out.println((int) x + " - " + (double) y);
    }
}