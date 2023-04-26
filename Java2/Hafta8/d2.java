public class d2 {
    public static void main(String[] args) {
        // dizinin_veri_tipi[ ][ ] dizi_adı = new dizinin_veri_tipi[boyut1_eleman_sayısı] [boyut2_eleman_sayısı];
        // dizinin_veri_tipi dizi_adı[ ] [ ] = new dizinin_veri_tipi[boyut1_eleman_sayısı] [boyut2_eleman_sayısı];

        int[][] cokBoyutlu1 = new int[2][3];// 2 satır daki eleman sayısı bilgisi,
                                            // 3 sutundaki eleman sayısı bilgisi
    
        System.out.println(cokBoyutlu1.length);//uzunluk, elemansayısı/satır sayısı
        System.out.println(cokBoyutlu1[0].length);
        System.out.println(cokBoyutlu1.length*cokBoyutlu1[0].length);

        //dizinin elemanlarına ulaşm
        System.out.println();
        System.out.println(cokBoyutlu1[0][0]);

        int[ ] [ ] cokBoyutlu2 = { {11,12,13} , {21,22,23} , {31,32,33} };
        int[ ] [ ] cokBoyutlu3 = new int[][] { {11,12,13} , {21,22,23} , {31,32,33} };

        System.out.println("Yazdırma 1");
        for (int i = 0; i < cokBoyutlu3.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < cokBoyutlu3[i].length; j++) {//sıradaki satırın eleman sayısı, sıradaki satırın sutun sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.println(cokBoyutlu2[i][j]);
                
            }
            
        }

        System.out.println("Yazdırma 2");
        for (int i = 0; i < cokBoyutlu3.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < cokBoyutlu3[i].length; j++) {//sıradaki satırın eleman sayısı, sıradaki satırın sutun sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu2[i][j]);                
            }
            System.out.println();
        }

        System.out.println("Yazdırma 3");
        for (int i = 0; i < cokBoyutlu3.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < cokBoyutlu3[i].length; j++) {//sıradaki satırın eleman sayısı, sıradaki satırın sutun sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu2[i][j]+" ");                
            }
            System.out.println();
        }

        System.out.println("Yazdırma 4");
        for (int i = 0; i < cokBoyutlu3.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < cokBoyutlu3[i].length; j++) {//sıradaki satırın eleman sayısı, sıradaki satırın sutun sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu2[i][j]+"\t");                
            }
            System.out.println();
        }

        System.out.println("Yazdırma 5");
        for (int i = 0; i < 3; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < 3; j++) {//sıradaki satırın eleman sayısı, sıradaki satırın sutun sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(cokBoyutlu2[i][j]+"\t");                
            }
            System.out.println();
        }
    }
}
