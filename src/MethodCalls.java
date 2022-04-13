public class MethodCalls {
    public static void main(String[] args) {
        dosomething();
    }//endmain
    public  static void dosomething()
    {
        int x=getsomething();
        System.out.println(x);
    }
    public static int getsomething()
    {
        return 10;
    }
}
