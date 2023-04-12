import java.util.Scanner;

public class d24 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sicaklik, toplam = 0;
        double ortalama;
        String ay;
        int gunSayisi;

        System.out.println("Ay:");
        ay = giris.nextLine();

        if (ay.equals("Subat"))
            gunSayisi = 4;
        else
            gunSayisi = 5;

        for (int i = 0; i < gunSayisi; i++) {
            System.out.println("Sıcaklık Gir:");
            sicaklik = giris.nextDouble();
            toplam += sicaklik;
        }

        ortalama = toplam / gunSayisi;

        System.out.println(ay+" Ayına ait Ortalama Sıcaklık="+ortalama+" derecedir");



        /*
        if (ay.equals("Subat")) {
            for (int i = 0; i < 28; i++) {
                System.out.println("Sıcaklık Gir:");
                sicaklik = giris.nextDouble();
                toplam += sicaklik;
            }
        } else {
            for (int i = 0; i < 30; i++) {
                System.out.println("Sıcaklık Gir:");
                sicaklik = giris.nextDouble();
                toplam += sicaklik;
            }
        }
        */
    }
}
