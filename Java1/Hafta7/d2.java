public class d2 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[5];// 5 tane farklı bilgi saklanabilir

        // dizinin elamanına değer ataması
        sayilar1[0] = 10;// dizilerde elemanların sıra numarası 0 dan başlar

        // dizinin elemanındaki değeri öğrenme/farklı değişkene atama/kullanma/okuma

        System.out.println(sayilar1[0]);// dizinin 1.elemanı dikkat sıra numarası 0 sıra numarası==>index numarası

        int sayi;
        sayi = sayilar1[0];

        if (sayilar1[0] > 5)
            System.out.println("Eleman değeri 5 den büyüktür");

        int[] sayilar2;
        // 22.satır hatalıdır, çünkü sayilar2 dizisinin kaç elemanlı olduğu
        // belirlenmemiştir. Eleman sayısı belli olmayan dizilerin elamanları üzerinde
        // işlem yapılamaz
        // sayilar2[0]=5;//sayilar2 dizisinin ilk elemanına 5 değerini ata

        //yukarıdaki hatayı şöyle düzeltebiliriz

        int[] sayilar3;
        sayilar3 = new int[10];


        //eğer dizimizin elamanları başlangıçta belliyse değer atama ile dizi anımlaması yapılabilir

        int[] sayilar4 = {5,10,15,20};//int[] sayilar4 = new int[4]; sayilar4[0]=5;sayilar4[1]=10;sayilar4[2]=15;sayilar4[3]=20;
        int sayi2 = 10;

        System.out.println(sayilar4[0]);//1.eleman ==> index numarası:0
        System.out.println(sayilar4[1]);//2.eleman ==> index numarası:1
        System.out.println(sayilar4[2]);//3.eleman ==> index numarası:2
        System.out.println(sayilar4[3]);//4.eleman ==> index numarası:3

        System.out.println(sayilar4[4]);//5.eleman ==> index numarası:4 //çalışma sırası bu satıra gelince HATA verecek


    }
}
