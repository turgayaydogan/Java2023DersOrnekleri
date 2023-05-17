public class d8 {
    public static void main(String[] args) {
        String str1 = "SDU";
        String str2 = "sdu";
        String str3 = "SDU";
        boolean sonuc1 = str1.equals(str2);
        boolean sonuc2 = str1.equals(str3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        System.out.println("**********");
        
        sonuc1 = str1.equalsIgnoreCase(str2);
        sonuc2 = str1.equalsIgnoreCase(str3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
    }
}
