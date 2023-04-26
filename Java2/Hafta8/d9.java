import java.util.Arrays;

public class d9 {
    public static void main(String[] args) {
        
        int[] sayilar1 = {1,5,11,9,7};
        int[] sayilar2 = sayilar1.clone();

        sayilar1[0] = 100;

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));


        System.out.println("***************************");
        System.out.println(Arrays.toString(sayilar1));
        Arrays.sort(sayilar1);
        System.out.println(Arrays.toString(sayilar1));

        System.out.println("***************************");
        Arrays.sort(sayilar1);
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[sayilar1.length-1]);

        System.out.println("***************************");
        Arrays.sort(sayilar2,2,4);//4-1.index dahil arasında sıralama yapar
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("***************************");
        // dizide arama için binary search kullanırlen ilk önce sort kullanılmalı
        // sort kullnılmaz ise hatalı sonuç verebilir

        Arrays.sort(sayilar2);
        System.out.println(Arrays.toString(sayilar2));
        int bulunanIndex = Arrays.binarySearch(sayilar2,9);
        System.out.println(bulunanIndex);

        bulunanIndex = Arrays.binarySearch(sayilar2,900);
        System.out.println(bulunanIndex);//eğer geri dönen değer/bulduğu değer netagif ise aranan dizi içerisinde bulunamamıştır

        System.out.println("***************************");
        int[] sayilar3 = sayilar2.clone();

        boolean sonuc = Arrays.equals(sayilar1, sayilar3);
        System.out.println(sonuc);
        sonuc = Arrays.equals(sayilar2, sayilar3);
        System.out.println(sonuc);

        System.out.println("***************************");
        int[] sayilar4 = Arrays.copyOf(sayilar3, 3);
        System.out.println(Arrays.toString(sayilar4));

        int[] sayilar5 = Arrays.copyOf(sayilar3, 10);
        System.out.println(Arrays.toString(sayilar5));

        System.out.println("***************************");
        int[] sayilar6 = Arrays.copyOfRange(sayilar3, 1, 4);
        System.out.println(Arrays.toString(sayilar6));
        
        
        System.out.println("***************************");
        Arrays.fill(sayilar6,-1);
        System.out.println(Arrays.toString(sayilar6));





    }
}
