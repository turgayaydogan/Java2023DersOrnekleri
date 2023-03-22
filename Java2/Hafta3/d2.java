public class d2 {
    public static void main(String[] args) {
        int a = 2, b = 3, c;
        c = a * b++ / 4 + 10 * a - b; // b=4
    //  c = 2 * 3   / 4 + 10 * 2 -4
    //  c = 6/4+10*2-4 ==>  6/4=1
    //  c = 1+10*2-4
    //  c = 1+20-4
        System.out.println(c);
    }
}
