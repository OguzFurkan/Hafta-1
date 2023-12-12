import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, kmUcreti, indiBindi = 20, tutar;

        System.out.println("Mesafeyi KM türü ile yazın");
        Scanner mesafe = new Scanner(System.in);

        km = mesafe.nextDouble();
        kmUcreti = km * 2.20;
        tutar = kmUcreti + 10;

        if (tutar >= 20) {

            System.out.println("Ödeyeceğiniz tutar " + tutar + "TL");

        } else if (tutar < 20) {
            System.out.println("Ödeyeceğiniz tutar " + indiBindi + "TL");
        }


    }
}
