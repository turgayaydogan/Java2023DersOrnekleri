/**
 * d1
 */
public class d1 {

    public static void main(String[] args) {
        asalSayiListele(5, 50);
    }

    static void asalSayiListele(int sayi1, int sayi2) {
        // her bir sayıyı kontrol edeceğiz
        // her bir sayının kac tane tam böleni var
        // eğer tam bolen adeti 2 ise o sayı asal

        for (int i = sayi1; i <= sayi2; i++) {

            // her bir sayının kac tane tam böleni var
            int adet = 0;
            for (int j = 1; j <= i; j++) {// 5%1,5%2,5%3,5%4,5%5 i%j
                int kalan = i % j;
                if (kalan == 0)// sıradaki sayı i tam bölünür
                    adet++;
            }

            // eğer tam bolen adeti 2 ise o sayı asal
            if (adet == 2)
                System.out.println(i + " sayı asal sayıdır");

        }

    }
}