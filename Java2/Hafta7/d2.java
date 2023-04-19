public class d2 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[5];// 5 elemanlı dizi tanımladık, içerisinde aynı anda 5 farklı bilgi
                                    // saklayabilecek

        // dizinin elemanına değer atama
        sayilar1[0] = 10;// dizinin elemanlarına ulaşak isediğimizde sıra numarası/index numarası

        // ilk eleman index numarası 0 dan başlar

        // dizinin elamanındaki değeri örenme/farklı değişkene atama/kullanmak

        System.out.println(sayilar1[0]);

        int sayi;
        sayi = sayilar1[0];

        if (sayilar1[0] > 5)
            System.out.println("Eleman değeri 5 den büyüktür");

        int[] sayilar2;
        //24.satır hatalıdır. dizinin eleman sayısı belirlenmemiştir.
        //eleman sayısı belli olmayan dizinin elemanına değer atanamaz
        //sayilar2[0] = 20;


        int[] sayilar3;
        sayilar3 = new  int[5];

        sayilar3[0] = 40;



        //eğer dizinin elemanları başlangıçta belliyse
        //başlangıçta değer atama işlemi ile dizi tanımlanabilir


        int[] sayilar4 = {5,10,15,20};//38.satırın eşdeğeri 39-43
        //int[] sayilar4 = new int[4];
        // sayilar4[0] = 5;
        // sayilar4[1] = 10;
        // sayilar4[2] = 15;
        // sayilar4[3] = 20;

        System.out.println(sayilar4[0]);//1.eleman ==> index numarası = 0
        System.out.println(sayilar4[1]);//2.eleman ==> index numarası = 1
        System.out.println(sayilar4[2]);//3.eleman ==> index numarası = 2
        System.out.println(sayilar4[3]);//4.eleman ==> index numarası = 3

        System.out.println(sayilar4[4]);//5.elaman varmı? yok HATA VERİR


    }
}
