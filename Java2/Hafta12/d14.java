import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        try {
            int[] sayilar = {10,20,30,40,50};

            Scanner giris =new Scanner(System.in);

            int girilenIndex,bolen;

            System.out.print("Dizi Index numarası gir:");
            girilenIndex = giris.nextInt();

            System.out.print("Bolen sayısı gir:");
            bolen = giris.nextInt();

            System.out.println(sayilar[girilenIndex]);


            int sonuc = sayilar[0] / bolen;
            System.out.println(sonuc);
        } catch (Exception e) {

            if( e instanceof ArithmeticException)
                System.out.println("HAta1");

            if(e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("Hata2");
        }
    }
}
