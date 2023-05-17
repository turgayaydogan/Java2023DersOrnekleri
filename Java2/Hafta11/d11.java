public class d11 {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "A";
        int sonuc1 = str1.compareTo(str2);
        int sonuc2 = str1.compareTo(str3);
        int sonuc3 = str2.compareTo(str1);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);

        // sonuc < 0 // str1 , str2 den önce geliyorsa
        // sonuc = 0 // str1 ve str2 eşitse
        // sonuc > 0 // str1 , str2 den sonra geliyorsa.
    }
}
