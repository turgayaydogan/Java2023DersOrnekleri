import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        tamBolen2();
    }

    public static void tamBolen() {
        try {
            Scanner giris = new Scanner(System.in);
            int sayi;

            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();// uygun veriler uygun veri tiplerine dönüştürülür

            for (int i = 1; i <= sayi; i++) {
                int kalan = sayi % i;
                if (kalan == 0)
                    System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz.");
        }

    }

    public static void tamBolen2() {
        int sayi=0;
        try {
            Scanner giris = new Scanner(System.in);
            

            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();// uygun veriler uygun veri tiplerine dönüştürülür

            for (int i = 1; i <= sayi; i++) {
                int kalan = sayi % i;
                if (kalan == 0)
                    System.out.println(i);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Bir hata oluştu, lütfen tekrar deneyiniz.");
        }

        if (sayi < 1)// klavyeden 1 den küçük sayı girilince 0 veya negatif ArithmeticException hatası oluşturulacak
            throw new ArithmeticException();

    }
}
