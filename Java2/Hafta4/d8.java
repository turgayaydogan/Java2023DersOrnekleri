public class d8 {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        if (i > j)// 1>2
            if (i > k)
                System.out.println("A");
            else
                System.out.println("B");
        // if-1 dışı

        if (i > j) {
            if (i > k)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
}
