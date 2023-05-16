public class d7 {
    public static void main(String[] args) {
        topla(5);
        topla(6,9);
        topla(1,3,5,7);

       
    }

    static void topla(int ... sayilar){
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }

        System.out.println(toplam);
    }
}
