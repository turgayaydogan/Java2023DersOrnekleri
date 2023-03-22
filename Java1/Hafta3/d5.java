import java.util.Scanner;

public class d5 {
    
    public static void main(String[] args) {
        int sayi1,sayi2,toplam;                 //null

        Scanner giris=new Scanner(System.in);

        System.out.print("1.Sayıyı Gir:");
        sayi1=giris.nextInt();                  //sayi1+

        System.out.print("2.sayıyı Gir:");
        sayi2=giris.nextInt();                  //sayi2+

        toplam = sayi1 + sayi2;                // toplam = ? + ? ; +

        System.out.println("Sayıların toplamı="+toplam);

    }
}
