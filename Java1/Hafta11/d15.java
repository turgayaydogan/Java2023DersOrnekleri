public class d15 {
    public static void main(String[] args) {
        String str1 = "Merhaba dünya";
        byte[] strByte = str1.getBytes();
        for (int i = 0; i < strByte.length; i++) {
            System.out.println(strByte[i]);
        }
    }
}
