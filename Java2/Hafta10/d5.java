import java.util.Arrays;

public class d5 {
    public static void main(String[] args) {
        
        int[] sayilar1 = {100,1,3,9,5,7};

        System.out.println(Arrays.toString(sayilar1));

        System.out.println(diziEBS(sayilar1));

        System.out.println(Arrays.toString(sayilar1));
        

    }
    //sayısal bir dizi parametre olarak bir metoda yollanacak
    //metot dizinin en büyük elemanını geri döndürecek


    static int diziEBS(int[] gelenDizi){
        int EBS=0;

        //Diziyi sırala
        //Dizinin en son elemanı enbüyük eleman olur

        Arrays.sort(gelenDizi);
        // son elemanın index numarası lazım
        // dizinin eleman sayısı - 1
        // 9 elemanlı bir dizide 9.eleman index numarası ==> gelenDizi.length-1 ==> 9-1=8
        EBS = gelenDizi[gelenDizi.length-1];

        return EBS;
    }
}
