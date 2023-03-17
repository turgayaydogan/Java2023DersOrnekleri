public class d8 {
    
    public static void main(String[] args) {
        
        int a=20;
        byte b;

        b = 20;

        System.out.println("a değişkeni="+a);
        System.out.println("b değişkeni="+b);


        System.out.println("****************");


        //b = a;//    byte = int      byte < int bu satır hatalı

        b = (byte)a;
        System.out.println("a değişkeni="+a);
        System.out.println("b değişkeni="+b);
        
    }
}
