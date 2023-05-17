public class d7 {
    public static void main(String[] args) {
        String str1 = new String("SDUCeng");
        String str2 = "Merhaba ";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println();

        System.out.println("Turgay".length());
        System.out.println(("Isparta").length());

        int uzunluk = str1.length();

        System.out.println(uzunluk);

        System.out.println(str1.charAt(0));// 1. karakteri al
        System.out.println(str1.charAt(1));// 2. karakteri al

        char karakter = str1.charAt(0);

        System.out.println(karakter);

        System.out.println();
        System.out.println("*******");
        System.out.println();

        String str3 = "Bugün hava çok güzel";
        for (int i = 0; i < str3.length(); i++) {// str3 ün karakter sayısı kadar dön
            System.out.println(str3.charAt(i));
        }

        System.out.println();
        System.out.println(str1);
        System.out.println(str1.substring(3));//index numarası 3 den itibaren al
        System.out.println(str1.substring(0, 3));//başlangıç index numarası, bitiş index numarası

    }
}
