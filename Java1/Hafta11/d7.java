public class d7 {
    public static void main(String[] args) {
        String str1 = "Bugün hava çok ama çok güzel";
        int bulunanIndex = str1.indexOf("çok");
        System.out.println(bulunanIndex);

        int bulunanIndex2 = str1.lastIndexOf("çok");
        System.out.println(bulunanIndex2);

        int bulunanIndex3 = str1.indexOf("çok", 12);//str1 içerisinde "çok" ifadesini ara ama 12.indexten itibaren ara
        System.out.println(bulunanIndex3);
    }
}
