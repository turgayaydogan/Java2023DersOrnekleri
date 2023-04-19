import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        // DİNAMİK DİZİ
        // Eleman sayısı sonradan belli olan dizi
        //HATALI KULLANIM 12.satır HATALI, DİNAMİK DİZİlerde ilk önce elemanSayısı belirlenir sonra dizi tanımlanır

        Scanner giris = new Scanner(System.in);
        int elemanSayisi = 0;
        
        int[] sayilar = new int[elemanSayisi];//dizinin eleman sayısı belirlendi

        System.out.println("Kaç Elemanlı dizi oluşturmak istiyorsunuz:");
        elemanSayisi = giris.nextInt();

        for(int i=0;i<sayilar.length;i++){
            sayilar[i] = (int)(Math.random()*100);
            System.out.println(sayilar[i]);
        }
    }
}
