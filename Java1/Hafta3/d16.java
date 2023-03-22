import java.util.Scanner;

public class d16 {
    public static void main(String[] args) {
        /*
         * 2.	Bir öğrencinin klavyeden girilen 100 lük notunu harfe çeviren bir program yazılması istenilmektedir. 
         *      Aşağıdaki kurallara göre harf notu ekrana yazdırılmak istenmektedir,
                a.	0<=notu<25      ==> F  if(0<=notu<25) HATALI if(0<=notu ve notu<25) ve ==> &&  veya ==> ||
                b.	25<=notu<45     ==> E
                c.	45<=notu<55     ==> D
                d.	55<=notu<70     ==> C
                e.	70<=notu<85     ==> B
                f.	85<=notu<=100   ==> A

         */

        int ogrNot;
        Scanner giris=new Scanner(System.in);

        System.out.println("0-100 Arasında bir not giriniz:");
        ogrNot = giris.nextInt();

        if(0<=ogrNot && ogrNot<25){     //  0<=20 ve 20<25  ==>     1/true ve 1/true=true
            System.out.println("F");
        }

        if(25<=ogrNot && ogrNot<45){    //  25<=20 ve 20<45 == >    0/false ve 1/true = 0/false
            System.out.println("E");
        }

        if(45<=ogrNot && ogrNot<55){
            System.out.println("D");
        }

        if(55<=ogrNot && ogrNot<70){
            System.out.println("C");
        }

        if(70<=ogrNot && ogrNot<85){
            System.out.println("B");
        }

        if(85<=ogrNot && ogrNot<=100){
            System.out.println("A");
        }



    }
}
