import java.net.SocketTimeoutException;

public class d14 {

    public static void main(String[] args) {
        String str1 = " SDUCeng ";
        String str2 = str1.replace('U', 'Ü');// 1 karakteri başka 1 karakter ile değiştirmek için kullanılır
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str2.length());

        String str3= str1.replaceAll("SDU", "SDÜ");
        System.out.println(str3);
    }
}
