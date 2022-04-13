public class CountDown {
    public static void main(String[] args)
    {
        Countdown(10);
        Countup(10,20);
    }
    public static void Countdown(int a)
    {
        if(a==0)
        {
            System.out.println(a);
            return;
        }

        System.out.println(a);

        Countdown(a-1);

    }
    public static void Countup(int a,int b)
    {
        if(a>=b)
        {
            System.out.println(a);
            return;
        }

        System.out.println(a);

        Countup(a+1,b);

    }



}
