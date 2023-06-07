import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d6 {
    public static void main(String[] args) {
        //Dizideki elemanları listeye akleme
        String[] array = { "elif", "melih", "dilek", "turgay" };

        // 1
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1);

        // 2
        List<String> list2 = new ArrayList();
        Collections.addAll(list2, array);
        System.out.println(list2);

        // 3
        List<String> list3 = new ArrayList<String>();
        for (String text : array) {
            list3.add(text);
        }
        System.out.println(list3);

    }
}
