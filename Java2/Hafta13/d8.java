import java.util.ArrayList;
import java.util.List;

public class d8 {
    
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(20);
        sayilar.add(50);

        System.out.println(sayilar);

        //sayilar.add("50");//hatalı veri ekleme, Integer olan bir listeye String değer eklenmeye çalışılıyor

        List sayilar2=new ArrayList<>();//sayilar2 adında bir liste var ve Sınıfı belli değil

        sayilar2.add(20);
        sayilar2.add(100);
        
        System.out.println(sayilar2);

        sayilar2.add("500");
        System.out.println(sayilar2);

        /*
         * sayilar2 
         * 
         * Index        Eleman          VeriTipi
         * 
         * 0            20              Integer
         * 
         * 1            100             Integer
         * 
         * 2            "500"           String
         * 
         * 
         * 
         * 
         * 
         */

         int sayi = sayilar.get(0);//uygun veriler uygun veritipine dönüştürülür
         System.out.println(sayi);


         //sayi = sayilar2.get(0);//uygun veriler uygun veritipine dönüştürülür HATALI
         sayi = (int)sayilar2.get(0);
         System.out.println(sayi);

         //sayi = (int)sayilar2.get(2);//HATALI sayilar2.get(2)=STRING

         String deger = (String)sayilar2.get(2);
         sayi = Integer.parseInt(deger);
         System.out.println(sayi);


         sayi = Integer.parseInt((String)sayilar2.get(2));
         System.out.println(sayi);


    }
}
