import java.util.Scanner;

public class d21 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        int sayi,toplam=0;

        do{
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            toplam += sayi;

        }while(toplam<21);

        System.out.println(toplam);
    }
}
