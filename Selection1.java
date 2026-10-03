import java.util.*;

class Selection1
{
    public static void main(String A[] )
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0;

        System.out.println("enter number :");
        No = sobj.nextInt();  
        
        if((No % 2) == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("ODD number");
        }
    }
}