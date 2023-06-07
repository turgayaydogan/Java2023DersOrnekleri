import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d7 {

    public static void main(String[] args) {
        String[] array = { "elif", "melih", "dilek", "turgay" };

        // 1
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1);

        // 2
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2, array);
        System.out.println(list2);

        // 3
        List<String> list3 = new ArrayList<String>();
        for (String text : array) {
            list3.add(text);
        }
        System.out.println(list3);

        // String olan bir liste nasıl diziye dönüştürülür
        String[] dizi=list1.toArray(new String[list1.size()]);
        for (int i = 0; i < dizi.length; i++)
            System.out.println(dizi[i]);

    }
}
