public class d2_1 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        
        y = 5 + ++x;        // 5+ 2      x in arttırılması ile ilgili bir öncelik var

        y = 10 + x++;       // 10 + 2 sonra 2 1 arttırılacak x=3 olacak

        System.out.println(x);
    }
}
