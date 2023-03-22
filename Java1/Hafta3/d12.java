import java.util.Scanner;

public class d12 {
    public static void main(String[] args) {
        /*
         * 1.	İki sayı arasında dört işlemden (toplama, çıkarma, çarpma, bölme) birini yapan bir program yazılması istenmektedir. 
         * Programın çalışma şekli şu şekilde olmalıdır; ilk önce iki sayının veri girişi yapılacak 
         * daha sonra ise kullanıcı hangi matematiksel işlemi yapmak istiyorsa o işlemin operatörünü 
         * bir karakter olarak klavyeden girecek. 
         * İki sayı kullanıcının girdiği matematik operatörüne göre hesaplamasını yapıp sonucu ekrana yazdıracaktır. 
         * Bu işlemi yapan program, ( toplama için +, çıkarma için -, çarpma için *, bölme için / veri girişi olduğunu varsayınız.)
         * 
         * 1.Sayı:50
         * 2.Sayı:2
         * İşlem:+      ==> 50+2=?    işlem + - * /
         * Sonuc=52
         */

        int sayi1=0,sayi2=0,sonuc=0;                          //sayi1+ sayi2+ sonuc- islem+
        char islem;

        Scanner giris=new Scanner(System.in);

        System.out.println("1.Sayı:");
        sayi1=giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2=giris.nextInt();

        System.out.println("İşlem:");
        islem=giris.next().charAt(0);

        if(islem=='+'){
            sonuc = sayi1 + sayi2;
        }

        if(islem=='-'){
            sonuc = sayi1 - sayi2;
        }

        if(islem=='*'){
            sonuc = sayi1 * sayi2;
        }

        if(islem=='/'){
            sonuc = sayi1 / sayi2;
        }

        System.out.println("İşlemin Sonucu="+sonuc);








    }
}
