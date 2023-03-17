public class d12 {
    public static void main(String[] args) {
        int x = 3; 
        int y = x+++x++-++x;
        //  y = x++ + x++ - ++x
        //  y = 3 + 4 - 6
        System.out.println(y);
    }
}
