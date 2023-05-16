public class d7 {
    public static void main(String[] args) {
        topla(1);
        topla(5,6,7,2,5);
        topla(3,5);

        //toplaDizi(1,3);  HATALI KULLANIM HATA VERİR
    }

    static void topla(int ... sayilar){//sayilar parametresi sanki bir boyutlu diziymiş gibi işlem yapılır
        int toplam =0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println(toplam);
    }

    static void toplaDizi(int[] sayilar){
        int toplam =0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println(toplam);
    }
}
