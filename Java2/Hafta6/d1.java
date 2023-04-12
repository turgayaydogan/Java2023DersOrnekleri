public class d1 {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;

        b1 = !b2; // b1 = !false b1 = !(false)

        System.out.println(b1);
        System.out.println(b2);

        if (!b1) // !true ==> false
            System.out.println("A");
        else
            System.out.println("B");

        System.out.println("************");

        if (b2==false) // false==false
            System.out.println("A");
        else
            System.out.println("B");

    }
}