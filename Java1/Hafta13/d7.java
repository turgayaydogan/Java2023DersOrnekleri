import java.util.ArrayList;
import java.util.List;

public class d7 {
    public static void main(String[] args) {
        //generic ve non-generic

        List<Integer> liste1=new ArrayList();
        
        List liste2=new ArrayList<>();

        liste1.add(50);
        //liste1.add("Ali"); // liste1 Integer sınıfından bir liste buraya sadece ilgili sınıftan değerler eklenebilir

        liste2.add(50);//liste2 non-generic yani liste2 object sınıfından oluşturulmuş, içerisine her şey eklenebilir.
        liste2.add("100");

        Integer eleman = liste1.get(0);
        System.out.println(eleman);

        eleman = (Integer)liste2.get(0);
        System.out.println(eleman);

        //eleman = (Integer)liste2.get(1);//DİKKAT, uygun veri tipleri dönüştürülür, burada string den dönüşüm yapılırken hata alınır.
        //System.out.println(eleman);

        /*
         * liste2
         * 
         * 50       ==>index 0      ==>Integer
         * "100"    ==>index 1      ==>String
         *  
         */

         String deger = (String)liste2.get(1);
         eleman = Integer.parseInt(deger);
         System.out.println(eleman);

         deger = liste2.get(1).toString();
         eleman = Integer.parseInt(deger);
         System.out.println(eleman);

         eleman = Integer.parseInt((String)liste2.get(1));
         System.out.println(eleman);

         Object nesne1 = liste2.get(0);
         Object nesne2 = liste2.get(1);

         Object nesne3 = liste1.get(0);



    }
}
