import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        double  sayi1,sayi2;
        double sonuc=0;                                  
        String islem;

        Scanner giris=new Scanner(System.in);                   

        System.out.println("1.Sayıyı Gir:");
        sayi1 =  giris.nextDouble();

        System.out.println("2.Sayıyı Gir:");
        sayi2 = giris.nextDouble();

        giris.nextLine(); // sayısal veri girişlerinden sonra string veri girişi için kullanıyoruz.

        System.out.println("İşlem Gir:");
        islem = giris.nextLine();

        // string veri tipinde eşitlik kontrolü equals()
        if(islem.equals("+")){                  // islem değişkeni içerisindeki değer + a eşitmi?    
            sonuc =  sayi1 + sayi2;
        }
        else if(islem.equals("-")){
            sonuc =  sayi1 - sayi2;
        }
        else if(islem.equals("*")){
            sonuc =  sayi1 * sayi2;
        }
        else if(islem.equals("/")){
            sonuc =  sayi1 / sayi2;        //double = int / int
        }
        //if in dışı
        System.out.println("Hesaplama Sonucu = "+ sonuc);



    }
}
