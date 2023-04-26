public class d2 {
    public static void main(String[] args) {
        // dizinin_veri_tipi[ ][ ] dizi_adı = new dizinin_veri_tipi
        // [boyut1_eleman_sayısı] [boyut2_eleman_sayısı];
        // dizinin_veri_tipi dizi_adı[ ] [ ] = new dizinin_veri_tipi
        // [boyut1_eleman_sayısı] [boyut2_eleman_sayısı];

        int[][] cokBoyutlu1 = new int[2][3];

        System.out.println(cokBoyutlu1[0][0]);

        System.out.println(cokBoyutlu1.length);// uzunluk,elemansayısı(satır),satır sayısını

        System.out.println(cokBoyutlu1[0].length);// uzunluk,1.satırın uzunluğu, 1.satırın eleman sayısı
        System.out.println(cokBoyutlu1[1].length);// uzunluk,2.satırın uzunluğu, 2.satırın eleman sayısı
        // 15satır HATALIDIR, dizinin 3.satırına ulaşmak isteniyor ama ulaşılamaz, çünkü
        // 3.satır yok
        // System.out.println(cokBoyutlu1[2].length);//uzunluk,3.satırın uzunluğu,
        // 3.satırın eleman sayısı

        System.out.println("Yazdırma 1");
        for (int i = 0; i < cokBoyutlu1.length; i++) {// satırda dolaşmak için
            for (int j = 0; j < cokBoyutlu1[i].length; j++) {// ilgili satırın sutunlarında dolaşmak için
                System.out.println(cokBoyutlu1[i][j]);
            }
        }

        System.out.println("Yazdırma 2");
        for (int i = 0; i < cokBoyutlu1.length; i++) {// satırda dolaşmak için
            for (int j = 0; j < cokBoyutlu1[i].length; j++) {// ilgili satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Yazdırma 3");
        for (int i = 0; i < cokBoyutlu1.length; i++) {// satırda dolaşmak için
            for (int j = 0; j < cokBoyutlu1[i].length; j++) {// ilgili satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Yazdırma 4");
        for (int i = 0; i < 2; i++) {// satırda dolaşmak için satır sayısı
            for (int j = 0; j < 3; j++) {// ilgili satırın sutunlarında dolaşmak için, sutun sayısı
                System.out.print(cokBoyutlu1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Yazdırma 5");
        for (int i = 0; i < cokBoyutlu1.length; i++) {// satırda dolaşmak için satır sayısı
            for (int j = 0; j < cokBoyutlu1[0].length; j++) {// ilgili satırın sutunlarında dolaşmak için, sutun sayısı
                System.out.print(cokBoyutlu1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("*******************");

        int[][] cokBoyutlu2 = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
        System.out.println("Yazdırma 6");
        for (int i = 0; i < cokBoyutlu2.length; i++) {// satırda dolaşmak için satır sayısı
            for (int j = 0; j < cokBoyutlu2[0].length; j++) {// ilgili satırın sutunlarında dolaşmak için, sutun sayısı
                System.out.print(cokBoyutlu2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
