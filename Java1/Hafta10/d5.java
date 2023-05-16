import java.util.Arrays;

public class d5 {
    public static void main(String[] args) {
        int[] sayilar1 = { 1, 3, 5, 9 };

        int[] sayilar2 = diziKopyala(sayilar1);

        System.out.println(Arrays.toString(sayilar2));


        int[] sayilar3 = {20,100,5,8,9,1,3};

        System.out.println(diziEBS(sayilar1));
        System.out.println(diziEBS(sayilar2));
        System.out.println(diziEBS(sayilar3));



    }

    static int[] diziKopyala(int[] gelenDizi) {
        return gelenDizi.clone();
    }

    // Metota parametre olarak yollanan int veri tipindeki bir dizinin enbüyük
    // elemanı bulunup geriye döndürülecek
    // bu işlemi gerçekleştiren bir metot yazınız

    static int diziEBS(int[] gelenDizi){
        Arrays.sort(gelenDizi);
        //en sondaki eleman en büyük elemandır,
        //sort ile küçükten-büyüğe sıraladık
        //örnek: dizi 5 elemanlı ise gelenDizi[4] ==> dizi.length-1 ==> en son elemanın index numarasını veri=gelenDizi.length-1
        //örnek: dizi 9 elemanlı ise gelenDizi[8] ==> dizi.length-1

        return gelenDizi[gelenDizi.length-1];
    }
}
