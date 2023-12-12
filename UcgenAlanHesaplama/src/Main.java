import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c;

        Scanner veri = new Scanner(System.in);

        System.out.println("İlk kenar uzunluğunu girin");
        a = veri.nextDouble();
        System.out.println("İkinci kenar uzunluğunu girin");
        b = veri.nextDouble();
        System.out.println("Üçüncü kenar uzunluğunu girin");
        c = veri.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Kenar uzunluklarını girdiğiniz üçgenin alanı " + alan);

        }
    }
