import java.util.Scanner;

public class d10 {
    public static void main(String[] args) {
        // DİNAMİK DİZİ
        // Eleman sayısı sonradan belli olan dizi

        Scanner giris = new Scanner(System.in);
        int elemanSayisi = 0;

        System.out.println("Kaç Elemanlı dizi oluşturmak istiyorsunuz:");
        elemanSayisi = giris.nextInt();

        int[] sayilar = new int[elemanSayisi];

        for(int i=0;i<sayilar.length;i++){
            sayilar[i] = (int)(Math.random()*100);
            System.out.println(sayilar[i]);
        }


    }
}
