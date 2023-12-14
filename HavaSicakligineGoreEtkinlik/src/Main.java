import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişken atandı.
        int heat;

        //Kullanıcıdan veri almak için scanner eklenerek değişkene atandı.
        Scanner input = new Scanner(System.in);
        System.out.print("Hava durumuna göre etkinlik önerisi almak için sıcaklığı girin: ");
        heat = input.nextInt();

        //İf koşulu ile şartlar oluşturuldu.
        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat < 10 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat < 25) {
            //iki etkinlik arası sıcaklık denk düştüğü için daha string değişken atayarak kullanıcaya isteği soruldu.
            if (heat >= 10 && heat <15 ) {
                String istek;
                Scanner request = new Scanner(System.in);
                System.out.println("Açık alanda mı bulunmak istersiniz yoksa kapalı alanda mı?:" +
                        "\nLütfen cevabınızı 'açık' ya da 'kapalı' olarak veriniz! ");
                istek = request.nextLine();
                if (istek.equals("kapalı")) {
                    System.out.println("Sinemaya gidebilirsiniz.");
                } else if (istek.equals("açık")) {
                    System.out.println("Piknik yapabilirsiniz.");
                }
            } else if (heat >= 15 && heat < 25) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsibiz.");
        }



    }
}