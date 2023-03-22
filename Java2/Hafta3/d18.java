import java.util.Scanner;

public class d18 {
    public static void main(String[] args) {
        double  sayi1,sayi2;
        double sonuc=0;                                  // null, sonuc=0 sonuc+
        char islem;

        Scanner giris=new Scanner(System.in);                   //  sayi1+  sayi2+  sonuc+  islem+

        System.out.println("1.Sayıyı Gir:");
        sayi1 =  giris.nextDouble();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextDouble();

        System.out.println("İşlem Gir:");
        islem = giris.next().charAt(0);

        if(islem=='+'){
            sonuc =  sayi1 + sayi2;
        }
        else if(islem=='-'){
            sonuc =  sayi1 - sayi2;
        }
        else if(islem=='*'){
            sonuc =  sayi1 * sayi2;
        }
        else {
            sonuc =  sayi1 / sayi2;        //double = int / int
        }
        //if in dışı
        System.out.println("Hesaplama Sonucu = "+ sonuc);
    }
}
