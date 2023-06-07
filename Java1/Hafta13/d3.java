import java.io.IOException;
import java.util.Scanner;

public class d3 {
    // klavyeden girilen pozitif bir tam sayının tam bölenlerini ekrana yazdıran bir
    // metot yazınız
    // eğer kullanıcı klavyeden pozitif sayı dışında bir tam sayı girer ise metot
    // hata üretsin, fırlatsın
    // bu işlemi gerçekleştiren bir metot yazınız
    public static void main(String[] args) {
        try {
            tamBolenler4();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void tamBolenler() {// pozitif tam sayı dışında veri girişinde ArithmeticException hata oluşturdu
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }
        if (sayi < 1)
            throw new ArithmeticException();
    }

    public static void tamBolenler2() {
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }
        if (sayi < 1)
            throw new ArithmeticException("Yanlış veri girişi");
    }

    public static void tamBolenler3() throws Exception {// kullanıcıyı bu metodu kullanırken try-catch kullanmasına zorladık
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }
        if (sayi < 1)
            throw new Exception();
    }

    public static void tamBolenler4() throws Exception {
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }
        if (sayi < 1)
            throw new Exception("Hatalı veri girişi");
    }

}
