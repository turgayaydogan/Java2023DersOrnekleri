public class d17 {
    public static void main(String[] args) {
        //Rastgele Sayı tutma
        int a, b, c;
        
        a = (int) (Math.random() * 10);//0-10
        System.out.println(a);
        
        a = 50;
        b = 100;
        c = a + ((int) (Math.random() * b)); // a.....(a+b)  50-150
        System.out.println(c);

    }
}
