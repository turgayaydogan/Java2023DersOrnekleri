import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        System.out.println(enBuyukSayi());
    }

    static int enBuyukSayi(){
        //ilk sayı EBS olarak belirlenir
        //girirlne sayılar EBS ile kıyaslanır
        // eğer girilenSayi>EBS ise EBS=girilenSayi olur

        int EBS=0;
        int sayi;
        
        Scanner giris = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();

            //9.satır karşılığı
            if(i==0)//1. sayı veri girişi
                EBS = sayi;

            //10. ve 11. satır karşılığı
            if(sayi>EBS)
                EBS = sayi;
        }

        return EBS;

    }
}
