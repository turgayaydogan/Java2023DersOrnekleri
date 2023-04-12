import java.io.InputStreamReader;
import java.util.Scanner;

public class d20 {
    public static void main(String[] args) {
        //Scanner giris = new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8")));
        
        Scanner giris = new Scanner(System.in);

        double toplam = 0, ortalama;
        String ay;
        int sicaklik, gunSayisi;

        System.out.println("Ay Gir:");
        ay = giris.nextLine();

        System.out.println(ay);

        if (ay.equalsIgnoreCase("?ubat"))
            gunSayisi = 4;
        else
            gunSayisi = 5;

        System.out.println(gunSayisi);
        
        
        for (int i = 0; i < gunSayisi; i++) {
            sicaklik = giris.nextInt();
            toplam += sicaklik;
        }

        ortalama = toplam / gunSayisi;

        System.out.println(ay + " Ayına ait Ortalama Sıcaklık=" + ortalama + " derecedir.");

    }
}
