public class d4 {
    

    public static void main(String[] args) {
        char c1='A';
        char c2='a';

        System.out.println(c1);
        System.out.println(c2);

        c2=c1;//=> c2 = 'A'
        System.out.println(c2);

        char c3='\\';
        char c4='\u0041';//hex => 65  A 
        System.out.println(c3);
        System.out.println(c4);

    }
}
