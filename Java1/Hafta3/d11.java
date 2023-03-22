import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double not1,not2,ort;

        System.out.println("Not1:");
        not1 = giris.nextDouble();     // double = double

        System.out.println("Not2:");
        not2=giris.nextDouble();

        ort = not1*0.4+not2*0.6;

        System.out.println("Oralaman="+ort);

        //Eğer öğrencinin ortalaması 70 ve 70 den büyük ise ekrana başarılı yazsın
        //eğer öğrencinin ortalaması 70 den küçük ise ekrana başarısız yazsın 
        /*
        if(){
            //ise
        }
        else{
            //değilse
        }
        //if dışı
        */

        if(ort>=70){
            System.out.println("Başarılı");
        }
        else{
            System.out.println("Başarısız");
        }
    }
}
