public class d13 {
    public static void main(String[] args) {
        String str1 = "Canan Can ";
        boolean sonuc1 = str1.startsWith("Can");// str1 Can ile başlıyormu?
        boolean sonuc2 = str1.endsWith("Can");// str1 Can ile bitiyormu?
        boolean sonuc3 = str1.contains("Can");// str1 Can ifadesini içeriyormu?
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
}
