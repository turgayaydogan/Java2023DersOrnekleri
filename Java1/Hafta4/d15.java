import java.util.Scanner;

public class d15 {
    public static void main(String[] args) {
        // if ile ilgili dikkat edilmesi gereken durumlar
        // if şartından sonra ; yazılırsa boş bir ise oluşturulur
        int baslangic, bitis, kalan1, kalan2;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç Sayısı:");
        baslangic = giris.nextInt();           // 1

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();               // 10

        do {

            kalan1 = baslangic % 8;
            kalan2 = baslangic % 5; // 1,2,3,4 ==> kalan2!=0

            if (kalan1 == 0 && kalan2 != 0); {
                System.out.println(baslangic); // şarta bağlı değil

                                   
            }
            /*
            if (kalan1 == 0 && kalan2 != 0){

            }
            
            {
                System.out.println(baslangic); // şarta bağlı değil
            }
            */


            baslangic++;  // şarta bağlı değil
        
        } while (baslangic <= bitis);
       

    }
}
