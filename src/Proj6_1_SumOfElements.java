import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(56);
        arr.add(104);
        arr.add(203);
        int sum=add(arr);
        System.out.println(sum);
    }
    public static int add(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }
}
