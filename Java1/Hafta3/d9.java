import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double not1,not2,ort;

        System.out.println("Not1:");
        not1 = giris.nextDouble();     // double = double

        System.out.println("Not2:");
        not2=giris.nextDouble();

        ort = not1*0.4+not2*0.6;

        System.out.println("Oralaman="+ort);

        //Eğer öğrencinin ortalaması 70 ve 70 den büyük ise ekrana Tebrikler yazsın

        if(ort>=70)// 56>=70 doğrumu?   //90>=70 doğrumu?
        {
            System.out.println("Tebrikler");
        }
        //eğerin dışı
        

    }
}
