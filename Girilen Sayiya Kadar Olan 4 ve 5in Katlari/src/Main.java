import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();

        //4 ve 5'in üsleri için  for döngüsü içinde iki farklı değişken tanımlandı ve koşullar değişkenlere göre atandı.
        for (int i = 1, k = 1; i <= n || k <= n; i *= 4, k *= 5) {
            System.out.println("4'ün Üssü: " + i);
            System.out.println("5'in Üssü: " + k);
        }

    }
}