public class d7 {
    public static void main(String[] args) {
        String[][] ogrenciBilgileri = {
                { "Ali", "1", "50", "60" },
                { "Ayşe", "2", "60", "80" },
                { "Veli", "3", "90", "80" }
        };

        for (int i = 0; i < ogrenciBilgileri.length; i++) {
            for (int j = 0; j < ogrenciBilgileri[i].length; j++) {
                System.out.print(ogrenciBilgileri[i][j] + "\t");
            }
            System.out.println();
        }

        // Vizesi 50 den büyük olanların Final notlarını ekrana yazdır
        // 1.öğrenci vizesi => ogrenciBilgileri[0][2]

        for (int i = 0; i < ogrenciBilgileri.length; i++) {
            if (Integer.parseInt(ogrenciBilgileri[i][2]) > 50)// string>int ? ==> ogrenciBilgileri[i][2] > 50 HATALI
                                                              // aynı veri tipinde olmalı
                System.out.println(ogrenciBilgileri[i][3] + "\t");
        }

        // String veri tipinden diğer veritiplerine dönüşüm yapmak için
        // Aralık içinde hata vermezi aralık dışında olur ise hata verir

        double sonuc1 = Double.parseDouble("500.5");
        System.out.println(sonuc1);

        float sonuc2 = Float.parseFloat("500.5");
        System.out.println(sonuc2);

        long sonuc3 = Long.parseLong("2563987");
        System.out.println(sonuc3);

        short sonuc4 = Short.parseShort("256");
        System.out.println(sonuc4);

        byte sonuc5 = Byte.parseByte("127");
        System.out.println(sonuc5);

        int sonuc6 = Integer.parseInt("500");
        System.out.println(sonuc6);

    }
}
