import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class d5 {
    public static void main(String[] args) {
        byte[] b_arr = {116, 117, 114, 103, 97, 121};
        Charset cs1 = StandardCharsets.US_ASCII;
        Charset cs2 = StandardCharsets.UTF_16BE;
        String str1 = new String(b_arr, cs1);
        String str2 = new String(b_arr, cs2);
        System.out.println(str1);
        System.out.println(str2);
    }
}
