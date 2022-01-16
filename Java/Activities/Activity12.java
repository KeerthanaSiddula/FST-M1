package Activities;

interface Addable
{
    int add(int num1, int num2);
}
public class Activity12{
    public static void main(String[] args) {
        Addable fn1=(int num1,int num2)->{
            return num1+num2;
        };
        Addable fn2=(int num1,int num2)->num1+num2;
        int ad2 = fn1.add(3,4);
        int ad1 = fn2.add(5,4);
        System.out.println(ad1+","+ad2);
    }
}