import java.util.*;
class Switchcase
{
    public static void main(String A[])
    {
        int std = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your standerd :");
        std = sobj.nextInt();

        switch (std) 
        {
            case 1:
                System.out.println("exam time is 9 am");
                break;
            case 2:
                System.out.println("exam time is 10 am");
                break;
            case 3:
                System.out.println("exam time is 11 am");
                break;
        
            default:
                System.out.println("its invalid");
                break;
        }


    }
}