
public class Main {
    public static void main(String[] args) {

        //İşlemin kaç defa döneceğini belirlemek için değişken belirlendi
        int islemAdimi = 10;

        //İşleme başlamak için ilk değer ve ikinci değer atandı.
        int ilkDeger = 0;
        int ikinciDeger = 1;

        //For döngüsü ile döngü başlatıldı.
        for (int i = 1; i <= islemAdimi; i++){

            int toplam = ilkDeger + ikinciDeger; // her döngüden sonra değerlerin toplamını almak için toplam değişkeni belirlendi.
            ilkDeger = ikinciDeger; //Her yeni işlemde ikinci değeri ilk değere atıyor.
            ikinciDeger = toplam; //İkinci değeri önceki işlemin toplamı ile güncelliyor.

            System.out.println(ilkDeger + " ");
        }
    }
}