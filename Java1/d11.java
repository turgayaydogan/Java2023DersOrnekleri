public class d11 {
    public static void main(String[] args) {
        
        int s1=10,s2=1;

        s1 = s1 + s2++;//  s2 = s2 + 1      s2+=1;
        // s1 = 10 + 1,  2.işlem s2=s2+1 ==> s2 = 1 +1 =2

        System.out.println(s1);
        System.out.println(s2);

        s1=10;
        s2=1;

        s1 = s1 + ++s2;//  s2 = s2 + 1      s2+=1;
        // s1 = 10 +  2  //1.işlem s2 = s2+1, 1+1 2.işlem s1+s2

        System.out.println(s1);
        System.out.println(s2);


    }
}
