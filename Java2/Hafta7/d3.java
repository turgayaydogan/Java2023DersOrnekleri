public class d3 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[] { 5, 4, 9, 7, 8 };
        int[] sayilar2 = { 5, 4, 9, 7, 8 };

        int sayilar3[] = new int[] { 5, 4, 9, 7, 8 };
        int sayilar4[] = { 5, 4, 9, 7, 8 };

        System.out.println(sayilar4[0]);// index bilgisi sayısal/int bilgi
        System.out.println(sayilar4[1]);
        System.out.println(sayilar4[2]);
        System.out.println(sayilar4[3]);
        System.out.println(sayilar4[4]);

        System.out.println("Dizi Ekrana Yazdırma 1");
        for (int i = 0; i < 5; i++)
            System.out.println(sayilar4[i]);//i değişkeninde index değeri var

        System.out.println("Dizi Ekrana Yazdırma 2");
        // sayilar4.length = bu bize dizinin eleman sayısını/uzunluk
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println(sayilar4[i]);
        }

        System.out.println("Dizi Ekrana Yazdırma 3");
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println((i+1)+".Eleman = "+sayilar4[i]);
        }

        //HATA VERİR NEDEN?
        System.out.println("HATALI");
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println(++i+".Eleman= "+sayilar4[i]);
        }


    }
}
