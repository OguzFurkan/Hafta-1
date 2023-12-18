import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken belirlendi ve scanner kütüphanesi eklenerek ona atandı.
        int deger;
        Scanner input = new Scanner(System.in);
        System.out.print("Değer girin: ");
        deger = input.nextInt();

        //İç içe for döngüsü ile koşullar atandı.
        for (int i = deger; i >= 1; i--) {

            for (int k = 1; k <= (deger - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i) - 1; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}