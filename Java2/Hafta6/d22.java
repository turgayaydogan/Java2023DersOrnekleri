import java.util.Scanner;

public class d22 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,adet=0,toplam=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            if(sayi<0)
                adet++;
            
            if(sayi>0)
                toplam+=sayi;
        }

        System.out.println(adet);
        System.out.println(toplam);
    }
}
