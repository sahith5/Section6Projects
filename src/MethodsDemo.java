public class MethodsDemo {
    public static void main(String[] args) {
        print();
        sub(2,3);
        int a=getTen();
        System.out.println(a);
        int b=add(2,3);
        System.out.println(b);
        double sq=square(2.13);
        System.out.println(sq);


    }//endmain


    public  static void print()
    {
        System.out.println("hello");
    }
    public static void sub(int a,int b)
    {
        System.out.println(a-b);
    }


    public static int getTen()
    {
     return 10;
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double square(double d)
    {
        return d*d;
    }


}
