import java.lang.reflect.Array;
import java.util.Arrays;

public class d9 {
    public static void main(String[] args) {
        // ARRAY sınıfı metodları

        int[] sayilar1 = { 1, 9, 5, 3, 2 };

        int[] sayilar2 = sayilar1.clone();
        sayilar1[0] = 100;

        System.out.println(Arrays.toString(sayilar1));
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("***********************************");
        Arrays.sort(sayilar1);
        System.out.println(Arrays.toString(sayilar1));

        System.out.println("Dizi en küçük ve en büyük eleman");
        Arrays.sort(sayilar1);
        System.out.println(sayilar1[0]);
        System.out.println(sayilar1[sayilar1.length - 1]);

        System.out.println("***********************************");
        System.out.println(Arrays.toString(sayilar2));
        Arrays.sort(sayilar2, 2, 5);
        System.out.println(Arrays.toString(sayilar2));

        System.out.println("***********************************");
        //Arrays.binarySearch kullanmak için ilk önce sort işlemi yapılmalı
        Arrays.sort(sayilar2);
        int sonuc = Arrays.binarySearch(sayilar2, 5);// dizi içerisinde 5 arar ve bulunduğu index numarasını getirir
        System.out.println(sonuc);

        sonuc = Arrays.binarySearch(sayilar2, 50);// dizi içerisinde 50 arar ve bulunduğu index numarasını getirir,
                                                  // bulamaz ise 0 dan küçük bir değer getirir
        System.out.println(sonuc);

        System.out.println("***********************************");
        int[] sayilar3 = sayilar1.clone();

        boolean esitmi = Arrays.equals(sayilar1, sayilar3);
        System.out.println(esitmi);
        esitmi = Arrays.equals(sayilar2, sayilar3);
        System.out.println(esitmi);

        System.out.println("***********************************");
        int[] sayilar4 = Arrays.copyOf(sayilar3, 3);
        System.out.println(Arrays.toString(sayilar3));
        System.out.println(Arrays.toString(sayilar4));

        System.out.println("***********************************");
        int[] sayilar5 = Arrays.copyOfRange(sayilar3, 2, 4);//2,3
        System.out.println(Arrays.toString(sayilar3));
        System.out.println(Arrays.toString(sayilar5));

        int[] sayilar6 = Arrays.copyOfRange(sayilar3, 2, 9);//2,3,4,5,6,7,8
        System.out.println(Arrays.toString(sayilar3));
        System.out.println(Arrays.toString(sayilar6));
        System.out.println("***********************************");
        int[] sayilar7 =new int[10];
        System.out.println(Arrays.toString(sayilar7));
        Arrays.fill(sayilar7,-1);
        System.out.println(Arrays.toString(sayilar7));



    }
}
