public class d7 {
    public static void main(String[] args) {
        String[][] ogrenciler = {
            {"Ali","1","50","60"},
            {"Ayşe","2","60","80"},
            {"Veli","3","90","80"},
            {"Melih","4","80","80"}
        };

        System.out.println("Öğrenci\tNo\tVize\tFinal");
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i][0]+"\t"+ogrenciler[i][1]+"\t"+ogrenciler[i][2]+"\t"+ogrenciler[i][3]);
        }

        //Vizesi 70 den küçük olanların finallerini ekrana yazdır
        System.out.println();
        for (int i = 0; i < ogrenciler.length; i++) {
            if(Integer.parseInt(ogrenciler[i][2])<70)// string<int ?  bu işlem hatalı ogrenciler[i][2]<70
                System.out.println(ogrenciler[i][3]);
        }

        //DİKKAT String veritipinden diğer veri tiplerine dönüşüm
        //string den dönüşüm yaparken alt-üst sınıra dikkat etmelisiniz

        double sonuc1 = Double.parseDouble("50.65");
        System.out.println(sonuc1);

        float sonuc2 = Float.parseFloat("65.789");
        System.out.println(sonuc2);

        short sonuc3 = Short.parseShort("250");
        System.out.println(sonuc3);

        byte sonuc4 = Byte.parseByte("127");
        System.out.println(sonuc4);

        long sonuc5 =Long.parseLong("789456");
        System.out.println(sonuc5);


    }
}
