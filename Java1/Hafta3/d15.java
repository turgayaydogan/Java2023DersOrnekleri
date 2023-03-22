import java.util.Scanner;

public class d15 {
    public static void main(String[] args) {
        double sayi1=0,sayi2=0;         
        double sonuc=0;                          
        char islem;

        Scanner giris=new Scanner(System.in);           //sayi1+ sayi2+ sonuc- islem+

        System.out.println("1.Sayı:");
        sayi1=giris.nextDouble();

        System.out.println("2.Sayı:");
        sayi2=giris.nextDouble();

        System.out.println("İşlem:");
        islem=giris.next().charAt(0);

        if(islem=='+'){
            sonuc = sayi1 + sayi2;
        } 
        else if(islem=='-'){
            sonuc = sayi1 - sayi2;
        }
        else  if(islem=='*'){
            sonuc = sayi1 * sayi2;
        } 
        else {
           sonuc = sayi1 / sayi2;  
        }
        //if dışı
        System.out.println("İşlemin Sonucu="+sonuc);
    }
}
