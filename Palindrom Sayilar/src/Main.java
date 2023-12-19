import java.util.Scanner;

public class Main {

    static boolean IsPalindrom(int number) {

        int value = number, reverseNumber = 0, lastNumber;

        while (value != 0) {
            lastNumber = value % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            value /= 10;
        }

        if (reverseNumber == number) {
            System.out.print(number + " bir palindrom sayıdır. ");
            return true;
        }else {
            System.out.println(number + "=>" + " palindrom sayı değildir. ");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.print("Hesaplamak istediğiniz sayıyı girin: ");

        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        System.out.println(IsPalindrom(number));
    }
}