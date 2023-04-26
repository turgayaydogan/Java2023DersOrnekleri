import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {

        int[][] notlar = new int[3][2];

        Scanner giris = new Scanner(System.in);

        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i + 1) + ".Vize Gir: ");
            notlar[i][0] = giris.nextInt();

            System.out.print((i + 1) + ".Final Gir: ");
            notlar[i][1] = giris.nextInt();
        }
        System.out.println("Öğrenci Notları");
        System.out.println("------------------------------");
        System.out.println("Öğrenciler\tVize\tFinal");
        for (int i = 0; i < notlar.length; i++) {
            System.out.println((i + 1) + ".Öğrenci = \t" + notlar[i][0] + "\t" + notlar[i][1]);
        }
        System.out.println("------------------------------");

        // a. Her öğrencinin ortalamasını bulup ekrana
        // yazdırınız(ortalama=vize*0.4+final*0.6).
        for (int i = 0; i < notlar.length; i++) {
            double ortalama = notlar[i][0] * 0.4 + notlar[i][1] * 0.6;
            System.out.println((i + 1) + ".Öğrenci Ortalaması= \t" + ortalama);
        }
        System.out.println("------------------------------");
        //Vizesi 50 den küçük olan öğrencilerin final notlarını ekrana yazdırınız.
        for (int i = 0; i < notlar.length; i++) {
            if(notlar[i][0]<50)
                System.out.println((i+1)+".Öğrenci Final Notu = "+notlar[i][1]);
        }
    }
}
