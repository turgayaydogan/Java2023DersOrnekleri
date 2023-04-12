import java.util.Scanner;

public class d15 {
    public static void main(String[] args) {
        // Klavyeden girilen bir sayının tam bölenlerini ekrana yazdırınız.

        // 8 ==> 1-2-4-8

        Scanner giris = new Scanner(System.in);
        int sayi, kalan;

        System.out.println("sayıyı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) { // 8%1, 8%2... 8&8 sayi%i;
            kalan = sayi % i;
            if (kalan == 0)// tam bölünebiliyor, tam böleni, kalansız böleni
                System.out.println(i);
        }
    }
}
