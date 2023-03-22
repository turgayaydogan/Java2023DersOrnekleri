public class d1{
    public static void main(String[] args) {
        int a = 2, b = 3, c;
        c = a * ++b / 4 + 10 * a - b;   // b = 4
    //  c=  2 *  4  / 4 + 10 * 2 - 4;
    //  c=  8       / 4 + 10 * 2 - 4;
    //  c= 2+10*2-4;
    //  c= 2+20-4;
    //  c= 18
        System.out.println(c);


        
    }
}