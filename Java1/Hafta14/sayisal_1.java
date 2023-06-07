/*
 * Sayısal loto programı yazılacaktır. Programın çalışması şu şekilde olacaktır;

1. Kullanıcıya nasıl bir kupon oluşturmak istediği sorulacak:

"Sadece tek sayılar için 1

Sadece çift sayılar için 2

Hem tek hem çift karışık sayılar için 3 bilgisi veri girişi olarak yapılacak (bunlardan başka veri girişi yapılmadığını varsayınız).

2. Kullanıcı seçim yaptıktan sonra 1-49(1 ve 49 dahil) sayılarından 1 kuponda 6 tane olmak üzere 2 kupon rastgele olarak otomatik oluşturulacak (toplamda 12 sayı otomatik oluşturulacak).

3. 2 kupondaki sayıların hepsi birbirinden farklı olmalıdır(kesinlikle aynı sayılar tekrar etmemelidir).

4. 2 kupon belirlendikten sonra ayrı ayrı ekrana yazdırılacaktır (1. kupon sayıları ........, 2. kupon sayıları ............).

5. Sadece derste anlatılan konular kullanılacaktır. Derste gösterilmeyen yapılar kullanılırsa 0 puan verilir.

6. Değişken isimlendirmeleri anlaşılır ve Türkçe kelimelerden esinlenmeli(int number; şeklinde değişken tanımlarsanız 0 puan verilir).

7. Döngü ihtiyaç ise sadece do-while veya while döngülerinden biri kullanılacaktır (for döngüsü kullananlara 0 puan verilir).

8. Sisteme sadece java dosyasını yükleyiniz ve dosyanın içeriğine ad, soyad ve öğrenci numaranızı ekleyiniz.
 */

public class sayisal_1 {
    public static void main(String[] args) {
        int[] sayilar = new int[12];
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

        System.out.println("1.Kupon");
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("2.Kupon");
        for (int i = 6; i < 12; i++) {
            System.out.println(sayilar[i]);
        }

    }

}