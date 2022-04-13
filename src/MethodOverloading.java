public class MethodOverloading {
    public static void main(String[] args) {
        add("hello","world");
    }//end main
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void add(String a,String b)
    {
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }

}
