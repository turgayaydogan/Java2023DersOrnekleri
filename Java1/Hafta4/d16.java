public class d16 {
    public static void main(String[] args) {

        boolean b = true;
        if (b = false)// true-false
            System.out.println("A");
        else
            System.out.println("B");

        /*
         * b = false;
         * 
         * if (b)//true-false
         * System.out.println("A");
         * else
         * System.out.println("B");
         * 
         */

        int i = 5;
        if (i = 5)//i e 5 değerini atadı ama boolean veri tipine dönüştüremedi
            System.out.println("A");
        else
            System.out.println("B");
    }
}
