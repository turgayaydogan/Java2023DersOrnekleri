public class d2 {
    public static void main(String[] args) {

        sayilariTopla(10, 20);// ==> parametre sayi1 = 10, parametre sayi2 = 20;

        int sayi1 = 50;
        int sayi2 = 60;

        sayilariTopla(sayi1, sayi2);// ==> parametre sayi1 = sayi1,50, parametre sayi2 = sayi2,60;
        sayilariTopla(sayi2, sayi1);// ==> parametre sayi1 = sayi2,60, parametre sayi2 = sayi1,50

    }

    static void sayilariTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }

    //parametreler local değişkene benzer, farkı sanki içerisinde değer varmış gibi değerlendirilir,
    //bundan dolayı 27.satır hata vermez.
    static void sayilariTopla_2(int sayi1, int sayi2) {
        int toplam;
        int sayi3;
        //toplam = sayi1 + sayi2 + sayi3;// bu satır HATAlıdır, sayi3 local değişken ve içerisine değer atanmamıştır
        //içerisine değer atanmayan değişkenler hesaplamalarda kullanılamaz, karşılaştırılamaz ve ekrana yazdırılamaz
        toplam = sayi1 + sayi2;
        System.out.println(toplam);
    }
}
