import java.util.Scanner;
class Max
{
    public int Maxx(int iNo1 , int iNo2, int iNo3, int iNo4)
    {
    
        if((iNo1>iNo2)&&(iNo1>iNo3)&&(iNo1>iNo4))
        {
            return iNo1;
        }
        else if((iNo2>iNo1)&&(iNo2>iNo3)&&(iNo2>iNo4))
        {
            return iNo2;
        }
        else if((iNo3>iNo1)&&(iNo3>iNo2)&&(iNo3>iNo4))
        {
            return iNo3;
        }
        else 
        {
            return iNo4;
        }
    }   
}

class Maxnum
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        Max max = null;

        int iValue1 = 0, iValue2 = 0, iValue3 = 0, iValue4 = 0, iResult = 0;
        scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        iValue1 = scanner.nextInt();

        System.out.println("Enter Second number :");
        iValue2 = scanner.nextInt();

        System.out.println("Enter Third number :");
        iValue3 = scanner.nextInt();

        System.out.println("Enter Forth number :");
        iValue4 = scanner.nextInt();

        max = new Max();
        iResult = max.Maxx(iValue1,iValue2,iValue3,iValue4);

        System.out.println("Maxx is :"+iResult);


    }
}