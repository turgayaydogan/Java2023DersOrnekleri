import java.util.Scanner;

public class d24 {
    public static void main(String[] args) {
        // başlangıç, bitiş, kalan

        int sayi,bitis,kalan1,kalan2;//kalan1 = 8, kalan2=5

        Scanner giris=new Scanner(System.in);

        System.out.println("Başlangıç Değeri:");
        sayi = giris.nextInt();

        System.out.println("Bitiş Değeri:");
        bitis = giris.nextInt();

        do{
            kalan1 = sayi % 8;     //0,1,2,3,4,5,6,7       ==> 0
            kalan2 = sayi % 5;     //0,1,2,3,4             ==> 1,2,3,4 => kalan2!=0

            if(kalan1==0 && kalan2!=0)//kalan1=0 ve kalan2=1,2,3,4
                System.out.println(sayi);
            
            sayi++;//sıradaki sayıyı arttıracak sona doğru ilerleyecek
            
        }while(sayi<=bitis);
    }
}
