import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, number3;
        Scanner number = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        number1 = number.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        number2 = number.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        number3 = number.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println("number1 < number2 < number3");
            } else {
                System.out.println("number1 < number3 < number2");
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println("number2 < number1 < number3");
            } else {
                System.out.println("number2 < number3 < number1");
            }
        } else {
            if (number1 < number2) {
                System.out.println("number3 < number1 < number2");
            } else {
                System.out.println("number3 < number2 < number1");
            }
        }
    }
}