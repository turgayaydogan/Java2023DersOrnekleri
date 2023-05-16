public class d2 {
    public static void main(String[] args) {
        // sayilariTopla(10,20);// ==> int sayi1=10; int sayi2=20;

        int toplam = ikiSayiyiTopla(10, 20);// ==> int sayi1=10; int sayi2=20;
        System.out.println(toplam);

        Math.sqrt(25);// 25 in karekökünü hesapladı ama hiçbir yerde sonucu kullanmadı

        double sonuc = Math.sqrt(25);
        System.out.println(sonuc);

        System.out.println(ikiSayiyiTopla(100, 20));

        int t = 50 +ikiSayiyiTopla(100, 200);
        System.out.println(t);

    }

    static void sayilariTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);

    }

    static int ikiSayiyiTopla(int sayi1, int sayi2) {
        int toplam;
        toplam = sayi1 + sayi2;
        return toplam;
    }
}
