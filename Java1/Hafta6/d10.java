public class d10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("A");

        int j;
        for (j = 0; j < 10; j++)
            System.out.println("A");

        int k = 0;
        for (; k < 10; k++)
            System.out.println("B");

        k = 0;
        for (; k < 10; )
            System.out.println(k++);//1,2,3,4,5,6,7,8,9,10
    }
}
