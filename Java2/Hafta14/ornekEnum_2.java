public class ornekEnum_2 {
    enum Seviye {
        DUSUK,
        ORTA,
        YUKSEK
    }

    public static void main(String[] args) {
        Seviye seviye1 = Seviye.ORTA;
        
        System.out.println(seviye1.ordinal());
        System.out.println(seviye1.name());
    }
}
