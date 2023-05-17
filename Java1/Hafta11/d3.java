import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class d3 {
    public static void main(String[] args) {
        Charset cs1 = StandardCharsets.US_ASCII;
        Charset cs2 = StandardCharsets.UTF_16BE;

        byte[] aa1 = new byte[127];
        byte[] aa2 = new byte[127];
        for (byte i = 0; i < 127; i++) {
            aa1[i] = i;
            aa2[i] = i;
        }
        String str1 = new String(aa1, cs1);
        String str2 = new String(aa2, cs2);
        System.out.println(str1);
        System.out.println(str2);
    }
}
