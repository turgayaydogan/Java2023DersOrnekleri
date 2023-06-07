import java.util.ArrayList;

public class d4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            sayilar.add(i);
        }

        System.out.println(sayilar.size());

        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }

    }
}
