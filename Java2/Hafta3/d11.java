import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        double not1,not2;
        double ort;
        
        Scanner giris=new Scanner(System.in);


        System.out.println("1.Notu Gir:");
        not1 = giris.nextDouble();         // not1 = giris.nextInt(); hata vermedi neden?      double = int 

        System.out.println("2.Notu Gir:");
        not2 = giris.nextDouble();

        ort = not1*0.4 + not2*0.6;
        
        System.out.println("Ortalama=" + ort);
    }
}
