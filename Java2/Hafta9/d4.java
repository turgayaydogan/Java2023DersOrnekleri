public class d4 {
    public static void main(String[] args) {
        System.out.println(ucSayiyiTopla_1(10, 20, 30));
        System.out.println(ucSayiyiTopla_2(10, 20, 30));
        System.out.println(ucSayiyiTopla_3(10, 20, 30));
        System.out.println(ucSayiyiTopla_4(1,10, 20, 30));
        
    }

    static int ucSayiyiTopla_1(int sayi1, int sayi2, int sayi3) {
        int toplam;
        toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    static int ucSayiyiTopla_2(int sayi1, int sayi2, int sayi3) {
        int toplam = sayi1 + sayi2 + sayi3;
        return toplam;
    }

    static int ucSayiyiTopla_3(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    static double ucSayiyiTopla_4(int sayi1,int sayi2,int sayi3,double sayi4){
        return sayi1+sayi2+sayi3+sayi4;
    }
}
