public class d5 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(rastgeleSayiTut());
        }

        
    }

    static int rastgeleSayiTut(){
        int sayi;
        sayi = (int)(Math.random()*101);//0-100 dahil arada sayı tut
        return sayi;
    }
}
