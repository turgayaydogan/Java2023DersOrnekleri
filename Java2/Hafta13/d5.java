import java.util.ArrayList;
import java.util.List;

public class d5 {
    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<Integer>();
        liste1.add(1);
        liste1.add(2);
        System.out.println(liste1);

        liste1.add(100);

        int uzunluk = liste1.size();
        System.out.println(uzunluk);

        for(int i=0 ; i<liste1.size();i++)
            System.out.println(liste1.get(i));


        liste1.set(0, 500);//index numarası 0 olan elemana 500 değeri atanır

        System.out.println();
        System.out.println("*********");

        for(int i=0 ; i<liste1.size();i++)
            System.out.println(liste1.get(i));

        liste1.remove(1);//listenin 2. elamanını silmek istiyoruz,index=1 olacak

        System.out.println();
        System.out.println("*********");

        for(int i=0 ; i<liste1.size();i++)
            System.out.println(liste1.get(i));

        liste1.clear(); //listedeki bütün elemanları silmek için, listeyi temizle

        System.out.println();
        System.out.println("*********");

        for(int i=0 ; i<liste1.size();i++)
            System.out.println(liste1.get(i));
        
    }
}
