public class d14_2 {
    public static void main(String[] args) {
        //String str1 = "Bugün hava çok ama çok güzel";
        String[] kelimeler = ("Bugün hava çok ama çok güzel").split("hava");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
    }
}
