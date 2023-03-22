import java.util.Scanner;

public class d16 {
    public static void main(String[] args) {
        /*
         * 1.	İki sayı arasında dört işlemden (toplama, çıkarma, çarpma, bölme) birini yapan bir program yazılması istenmektedir. 
         * Programın çalışma şekli şu şekilde olmalıdır; 
         * ilk önce iki sayının veri girişi yapılacak daha sonra ise 
         * kullanıcı hangi matematiksel işlemi yapmak istiyorsa o işlemin operatörünü bir karakter olarak klavyeden girecek. 
         * İki sayı kullanıcının girdiği matematik operatörüne göre hesaplamasını yapıp sonucu ekrana yazdıracaktır. 
         * Bu işlemi yapan program, ( toplama için +, çıkarma için -, çarpma için *, bölme için / veri girişi olduğunu varsayınız.)
         * 
         * 1.Sayı: 10 
         * 2.Sayı: 2
         * İşlem: +     ==> işlem + - / *
         * Sonuc=12
         */

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
 
         if(islem=='-'){
             sonuc =  sayi1 - sayi2;
         }
 
         if(islem=='*'){
             sonuc =  sayi1 * sayi2;
         }
 
         if(islem=='/'){
             sonuc =  sayi1 / sayi2;        //double = int / int
         }
 
         System.out.println("Hesaplama Sonucu = "+ sonuc);
    }
}
