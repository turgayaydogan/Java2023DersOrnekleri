import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d6 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            sayilar.add(i);
        }

        System.out.println(sayilar);

        List<Integer> sayilar2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (Integer i : sayilar2)
            System.out.println(i + " ");

        System.out.println("\n\n");

        Integer[] sayilarDizisi = { 1, 3, 5, 7, 9 };

        List<Integer> sayilar3 = Arrays.asList(sayilarDizisi);

        for (Integer i : sayilar3)
            System.out.println(i + " ");

    }
}
