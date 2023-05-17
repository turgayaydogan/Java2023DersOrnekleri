public class d9 {
    public static void main(String[] args) {
        String str1 = "Bugün hava çok ama çok güzel";
        int bulunanIndex = str1.indexOf("çokk");// buldğu ilk index numarasını getirir.
        System.out.println(bulunanIndex);

        bulunanIndex = str1.lastIndexOf("çok");// buldığu son index numarasını getirir.
        System.out.println(bulunanIndex);

        bulunanIndex = str1.indexOf("çok", 12);// 12.karakterden itibaren çok ifadesini ara
        System.out.println(bulunanIndex);

    }
}
