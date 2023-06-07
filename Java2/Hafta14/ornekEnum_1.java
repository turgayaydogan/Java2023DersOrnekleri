public class ornekEnum_1 {
    enum Seviye {
        DUSUK,
        ORTA,
        YUKSEK
      }

      enum SAYILAR {
        TEK,
        CIFT,
        KARISIK
      }
      
    public static void main(String[] args) {
        Seviye seviye1 = Seviye.YUKSEK;
        
        
        switch (seviye1) {
            case DUSUK:
                System.out.println("Düşük seviye");
                break;
            case ORTA:
                System.out.println("Orta seviye");
                break;
            case YUKSEK:
                System.out.println("Yüksek seviye");
                break;
        }


    }
}
