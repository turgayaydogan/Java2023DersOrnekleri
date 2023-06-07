import java.util.Arrays;

public class sayisal_2 {
    public static void main(String[] args) {
        int[] sayilar = new int[12];
        int[] kupon1 = new int[6];
        int[] kupon2 = new int[6];

        int adet = 0;// rastgele sayı adeti
        int secim = 0;// 1,2,3

        secim = 3;
        do {
            int sayi = (int) (Math.random() * 49) + 1;// 1-49

            // tutulan sayı tekmi, çiftmi?
            int kalan = sayi % 2;
            if (secim == 1 && kalan == 0)// tek istiyoruz ama çift geldi
                continue;
            if (secim == 2 && kalan == 1)// çift istiyoruz ama tek geldi
                continue;

            // tutulan sayi onceden tutulmuşmu varmı yokmu?
            boolean varMi = false;
            int baslangicIndex = 0;
            do {
                if (sayilar[baslangicIndex] == sayi)
                    varMi = true;

                baslangicIndex++;

            } while (varMi == false && baslangicIndex < 12);// bulamadığı ve sona gelmediği sürece devam edecek

            // eğer aynı sayı önceden var ise tekrar sayı tutmalı ve kontrol etmeli
            if (varMi == true)// if(varMi)
                continue;

            sayilar[adet] = sayi;
            adet++;
        } while (adet < 12);

        //2 farklı kupunu küçükten büyüğe sıralı yazdırmak için-başlangıç
        for (int i = 0; i < 6; i++) {
            kupon1[i] = sayilar[i];
        }

       
        for (int i = 6; i < 12; i++) {
            kupon2[i-6] = sayilar[i];

        }

        Arrays.sort(kupon1);
        Arrays.sort(kupon2);
        //2 farklı kupunu küçükten büyüğe sıralı yazdırmak için-bitiş

        System.out.println("1.Kupon");
        System.out.println(Arrays.toString(kupon1));

        System.out.println("2.Kupon");
        System.out.println(Arrays.toString(kupon2));
        

    }

}