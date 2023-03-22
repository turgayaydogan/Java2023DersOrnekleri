import java.util.Scanner;

public class d12 {
    public static void main(String[] args) {
        // Eğer ort 70 eşit veya 70 den büyükse erkana Tebrikler
        double not1,not2;
        double ort;
        
        Scanner giris=new Scanner(System.in);


        System.out.println("1.Notu Gir:");
        not1 = giris.nextDouble();          

        System.out.println("2.Notu Gir:");
        not2 = giris.nextDouble();

        ort = not1*0.4 + not2*0.6;
        
        System.out.println("Ortalama=" + ort);

        if(ort>=70){                        // 56>=70 ? hayır yanlış false 0
            System.out.println("Tebrikler");
        }

        /*
          if()
          {

          } 
          
         */
    }
}
