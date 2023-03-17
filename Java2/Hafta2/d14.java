public class d14 {
    
    public static void main(String[] args) {
        
        int s1=2,s2=10,s3;

        s3 = s1 + s2++; //  s3 = 2 + 10;    s2 = 10 + 1 = 11

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);

        System.out.println("*********************");

        s1=2;
        s2=10;

        s3 = s1 + ++s2; // ilk önce: s2 değeri 1 arttırılır, s2= s2 + 1 => s2 = 10 + 1 =11;   2.işlem toplama s3= 2 + 11 =13

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);

    }
}
