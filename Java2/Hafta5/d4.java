import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        int carpan, adim;
        Scanner giris = new Scanner(System.in);
        System.out.println("Carpan Gir:");
        carpan = giris.nextInt();

        System.out.println("Adım Gir:");
        adim = giris.nextInt();

        for(int i=1 ; i<= adim ;i++){
            int sonuc = i * carpan;
            System.out.println(i+" x "+carpan+" = "+sonuc);
        }

        //2.yöntem
        for(int i=1 ; i<= adim ;i++){
            
            System.out.println(i+" x "+carpan+" = "+ (i * carpan));
        }


    }
}
