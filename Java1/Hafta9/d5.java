import java.util.Scanner;

public class d5 {

    public static void main(String[] args) {
        sayilariListele();
    }

    // parametre listesi boş
    // geriye değer döndürmeyecek
    static void sayilariListele() {
        int sayi1, sayi2;
        int kalan;

        Scanner giris = new Scanner(System.in);

        System.out.println("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.println("2.Sayı:");
        sayi2 = giris.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {//klavyeden girilen 2 sayı arasındaki...
            kalan = i % 5; // sıradaki sayının 5 e bölümünden kalan hesaplanır
            if (kalan == 0)// 5e tam bölünür
                System.out.println(i);
        }

    }

    static void metot2(){
        Scanner giris=new Scanner(System.in);
    }
}
