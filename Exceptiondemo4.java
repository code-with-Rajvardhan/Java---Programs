import java.util.*;
class  AgeInvalid extends  Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}
class Exceptiondemo4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;

        System.out.println("Enteer your age :");
        Age = sobj.nextInt();
        try
    {
        if(Age < 18)
        {
            throw new AgeInvalid("you are under age");
        }
        else
        {
            System.out.println("welcome to ........");
        }
    }
    catch(AgeInvalid aobj)
    {
        System.out.println("Exception occuerd due to age");
    }

    }
}