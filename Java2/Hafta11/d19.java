public class d19 {

    public static void main(String[] args) {

        String str1 = "Merhaba dünya";
        char[] cDizi = new char[7];
        str1.getChars(0, 7, cDizi, 0);
        for (int i = 0; i < cDizi.length; i++) {
            System.out.println(cDizi[i]);
        }
    }
}
