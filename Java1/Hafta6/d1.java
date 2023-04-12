public class d1 {
    public static void main(String[] args) {

        // int tututalSayi = (int) (Math.random() * 100);

        boolean b1 = false;
        boolean b2 = false;

        b1 = !b2; // !false ==> !(false) ise b1=true

        System.out.println(b1); // true
        System.out.println(b2); // false

        if (!b1) // !true ==> if(false)
            System.out.println("A"); // ==> koşul doğru olduğunda çalışacak
        else
            System.out.println("B"); // ==> koşul yanlış olduğunda çalışacak

        if ((!b1)==false) //  (!true)==false        false==false
            System.out.println("A"); // ==> koşul doğru olduğunda çalışacak
        else
            System.out.println("B"); // ==> koşul yanlış olduğunda çalışacak

    }
}