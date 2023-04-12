public class d12 {
    public static void main(String[] args) {
        int x = 1, y = 10;

        while (true) {

            x++;                    // 2,3,4,5,6,7
            --y;                    // 9,8,7,6,5,4

           

            System.out.println(x);
            System.out.println(y);
        }
        //çıkış 
        
        System.out.println(x);   //Unreachable code, ulaşılamaz kod çünkü 5-14. satır sonsuz döngü
    }
}
