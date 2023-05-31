import java.util.ArrayList;
import java.util.List;



public class d18 {
    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<Integer>();
        liste1.add(1);
        liste1.add(2);
        System.out.println(liste1);

        liste1.add(50);

        System.out.println(liste1);

        int elemanSayisi = liste1.size();

        System.out.println(elemanSayisi);
        System.out.println(liste1.size());

        System.out.println(liste1.get(0));//index numarası 0 olan yani listenin ilk elemanına 1. elemanına ulaşıyoruz

        liste1.set(0, 100);//index numarası 0 olan elemana 100 değerini ata

        liste1.remove(0);//index nmarası 0 olan elemanı sil

        System.out.println(liste1);

        liste1.clear();//liste1 temizle, bütün elemanları sil

        System.out.println(liste1);

        

        



    }
}
