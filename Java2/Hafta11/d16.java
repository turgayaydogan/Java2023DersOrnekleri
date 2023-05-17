public class d16 {

    public static void main(String[] args) {

        String str1 = "Canan Can";
        boolean sonuc1 = str1.startsWith("Can");// str1 Can ile mi başlıyor?
        boolean sonuc2 = str1.endsWith("Can");  // str1 Can ile mi bitiyor?
        boolean sonuc3 = str1.contains("Can");  // str1 içinde Can ifadesi varmı?
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
}
