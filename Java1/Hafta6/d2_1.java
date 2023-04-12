public class d2_1 {
    public static void main(String[] args) {
        int x=1,y;

        y = 5 + ++x;                // 5 + (x=x+1)      ==> 5 + 2

        System.out.println(x);
        System.out.println(y);
    }
}
