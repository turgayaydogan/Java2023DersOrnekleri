import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        System.out.println(enBuyukSayi());
    }

    static int enBuyukSayi() {
        // 10 tane sayı girilecek
        // 1.sayı EBS olarak belirlenir, EBS = 1.sayı
        // sıradaki sayı ile EBS kıyaslanır
        // eğer sıradaki sayı>EBS ise EBS=sıradaki sayı
        int EBS = 0;
        int sayi;
        Scanner giris = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();
            if (i == 0)// ilk sayı girişi , 1.sayı girişi
                EBS = sayi;// 1.sayı EBS olarak belirlenir, EBS = 1.sayı

            if (sayi > EBS)// sıradaki sayı ile EBS kıyaslanır
                EBS = sayi;  // eğer sıradaki sayı>EBS ise EBS=sıradaki sayı
        }
        return EBS;
    }
}
