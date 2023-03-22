import java.util.Scanner;

public class d10 {
    public static void main(String[] args) {
        double not1,not2;
        double ort;

        Scanner giris=new Scanner(System.in);


        System.out.println("1.Notu Gir:");
        not1 = giris.nextDouble();         // not1 = giris.nextInt(); hata vermedi neden?      double = int 

        System.out.println("2.Notu Gir:");
        not2 = giris.nextDouble();

        // eğer ort int olarak tanımlanırsa HATALI
        //ort = (not1 + not2) / 2.0;//    int / double = double   ==>     int = double HATALI

        //ort = (not1 + not2) / 2;    //  int/int=int

        ort = (not1 + not2) / 2.0;  //  int/double = double     ==>     double =double
        
        System.out.println("Ortalama=" + ort);
    }
}
