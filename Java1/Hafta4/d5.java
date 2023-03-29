import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        //String değişken veri girişi ve eşitlik kontrolü
        double sayi1, sayi2;
        double sonuc = 0;
        String islem = "";

        Scanner giris = new Scanner(System.in);

        System.out.println("1.Sayıyı Gir:");
        sayi1 = giris.nextDouble();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextDouble();

        giris.nextLine();//sayısal veri girişlerinden sonra String veri girişi yapmak istiyorsak bu şekilde bir satır okumamız gerekiyor

        System.out.println("İşlem Gir:");
        islem = giris.nextLine();
        //String değişkenlerde eşitlik kontrolü için == kullanılmaz. equals() kullanılır
        if (islem.equals("+")) {//islem degiskeni içerisindeki değer + değerine eşitmi?
            sonuc = sayi1 + sayi2;
        }

        if (islem.equals("-")) {
            sonuc = sayi1 - sayi2;
        }

        if (islem.equals("*")) {
            sonuc = sayi1 * sayi2;
        }

        if (islem.equals("/")) {
            sonuc = sayi1 / sayi2; // double = int / int
        }

        System.out.println("Hesaplama Sonucu = " + sonuc);

    }
}
