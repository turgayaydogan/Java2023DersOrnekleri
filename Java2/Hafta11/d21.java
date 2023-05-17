public class d21 {
    public static void main(String[] args) {

        // metoda parametre olarak yollanan bir String değerin tersten
        // yazılmış/oluşturulmuş hali geri göddürülecektir

        /*
         * String str1 = "Bugün hava çok güzel";
         * for (int i = 0; i < str1.length(); i++) {// str3 ün karakter sayısı kadar dön
         * System.out.println(str1.charAt(i));
         * }
         * 
         * System.out.println("Tersten");
         * 
         * for(int i = str1.length()-1; i>=0 ;i--){// en son karakter INdex Numarası =
         * Dizi Eleman Sayısı-1
         * System.out.println(str1.charAt(i));
         * }
         */


        String str1 = "Bugün hava çok güzel";

        String tersSTR1 = tersle(str1);
        System.out.println(tersSTR1);

        System.out.println(tersle("Merhaba nasılsın?"));


    }

    static String tersle(String gelenString) {
        String sonuc="";
        for (int i = gelenString.length() - 1; i >= 0; i--) {
            sonuc += gelenString.charAt(i);         // sonuc = sonuc + gelenString.charAt(i);
        }

        return sonuc;

    }
}
