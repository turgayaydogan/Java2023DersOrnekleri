public class d14 {
    public static void main(String[] args) {
        String str1 = "Bugün hava çok ama çok güzel";
        String[] kelimeler = str1.split("hava");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
        System.out.println("*********");
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }
        System.out.println("*********");
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i].length());
        }
    }
}
