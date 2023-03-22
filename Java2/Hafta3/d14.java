import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        // Eğer ortalama 70 ve üzeri ise başarılı
        // Eğer ortalama 70 den küçük ise başarısız
        
        double not1,not2;
        double ort;
        
        Scanner giris=new Scanner(System.in);


        System.out.println("1.Notu Gir:");
        not1 = giris.nextDouble();          

        System.out.println("2.Notu Gir:");
        not2 = giris.nextDouble();

        ort = not1*0.4 + not2*0.6;
        
        System.out.println("Ortalama=" + ort);

        if(ort>=70){
            System.out.println("Başarılı");
        }
        else{
            System.out.println("Başarısız");
        }
        //1.if dışı
    }
}
