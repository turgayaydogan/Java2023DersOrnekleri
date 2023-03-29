public class d12 {
    public static void main(String[] args) {

        int a = 5;

        if (a == 4)// if(true) veya if(false)
            System.out.println("A");

        boolean secim = true;

        if (secim == true)
            System.out.println("A");
        else
            System.out.println("B");

        if (secim)
            System.out.println("A");
        else
            System.out.println("B");

        if (secim = true) // secim =true; sonra if(secim) if(true)
            System.out.println("A");
        else
            System.out.println("B");

        System.out.println(secim);
        if (secim = false)
            System.out.println("A");
        else
            System.out.println("B");
        System.out.println(secim);
    }
}
