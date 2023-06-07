import java.util.Scanner;

public class d3 {
    // klavyeden girilen pozitif bir tam sayının tam bölenlerini ekrana yazdıran bir
    // metot yazınız
    // eğer kullanıcı klavyeden pozitif sayı dışında bir tam sayı girer ise metot
    // hata üretsin, fırlatsın
    // bu işlemi gerçekleştiren bir metot yazınız
    public static void main(String[] args) {
        try {
            tamBolen3();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Bir hata oluştu lütfen veri girişini kontrol ediniz.");
        }
    }

    public static void tamBolen() {
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }

        if(sayi<1)// klavyeden 1 den küçük sayı girilince 0 veya negatif ArithmeticException hatası oluşturulacak
            throw new ArithmeticException();
    }

    public static void tamBolen2() {
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }

        if(sayi<1)// klavyeden 1 den küçük sayı girilince 0 veya negatif ArithmeticException hatası oluşturulacak
            throw new ArithmeticException("Pozitif sayı girilmedi");
    }

    public static void tamBolen3() throws Exception {//kullanıcıyı mutlaka try-catch kullanmaya zorlayan bir metot
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.print("Sayı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            int kalan = sayi % i;
            if (kalan == 0)
                System.out.println(i);
        }

        if(sayi<1)// klavyeden 1 den küçük sayı girilince 0 veya negatif ArithmeticException hatası oluşturulacak
            throw new Exception("Pozitif sayı girilmedi");
    }
}
