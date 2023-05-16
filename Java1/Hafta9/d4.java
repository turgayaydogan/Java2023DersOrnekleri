public class d4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(rastgeleSayiTut());
        }
    }

    static int rastgeleSayiTut(){
        int sayi = (int)(Math.random()*100);//0-99, (int)(Math.random()*101); ise 0-100 dahil olur
        return sayi;
    }
}
