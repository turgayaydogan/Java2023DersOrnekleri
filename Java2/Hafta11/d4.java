public class d4 {
    public static void main(String[] args) {
        byte[] b_arr = { 116, 117, 114, 103, 97, 121 };
        String str1 = new String(b_arr);
        System.out.println(str1);


        for (char i = 'a'; i < 'z'; i++) {
            System.out.println(i + " " + (byte) i);
        }
        
    }
}
