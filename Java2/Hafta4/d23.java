import java.util.Scanner;

public class d23 {
    public static void main(String[] args) {
        // başlangıç, bitiş, kalan

        int baslangic,bitis,kalan1,kalan2;//kalan1 = 8, kalan2=5

        Scanner giris=new Scanner(System.in);

        System.out.println("Başlangıç Değeri:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş Değeri:");
        bitis = giris.nextInt();

        do{
            kalan1 = baslangic % 8;     //0,1,2,3,4,5,6,7       ==> 0
            kalan2 = baslangic % 5;     //0,1,2,3,4             ==> 1,2,3,4 => kalan2!=0

            if(kalan1==0 && kalan2!=0)//kalan1=0 ve kalan2=1,2,3,4
                System.out.println(baslangic);
            
            baslangic++;//sıradaki sayıyı arttıracak sona doğru ilerleyecek
            
        }while(baslangic<=bitis);


    }
}
