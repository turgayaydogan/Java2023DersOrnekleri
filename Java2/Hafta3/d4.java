public class d4 {
    public static void main(String[] args) {
        char c='0'+'5';//karakterlerin ASCII kodlarını toplar
        // 0 = 48, 5 = 53 ==> 101
        System.out.println(c);//101 ASCII tabloda e

        int i = '2'+'3';//karakterlerin ASCII kodlarını toplar 50+51 =101
        System.out.println(i);
        System.out.println((char)i);

        int j = 5 + '3';//5 ile 3 karakterinin ASCII kod karşılığını toplar ==> 5 +51 = 56
        System.out.println(j);

    }
}
