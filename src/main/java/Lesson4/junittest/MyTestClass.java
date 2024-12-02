package lesson4.junittest;

public class MyTestClass {
    public static int add(int x,int y){
        return x + y;
    }
    public static int Sum(int n)
    {
        if (n == 1)            //base case
            return 1;
        else
            return Sum(n-1) + n; //general case
    }
}
