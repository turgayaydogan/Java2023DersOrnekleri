import java.util.Scanner;

public class d18 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kalan;

        System.out.println("Sayı:");
        sayi=giris.nextInt();


        for(int i=1; i<= sayi ; i++){
            kalan = sayi % i;
            if(kalan==0)//tam böleni
                System.out.println(i);
        }

    }
}
