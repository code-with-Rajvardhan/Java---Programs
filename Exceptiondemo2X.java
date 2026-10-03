import java.util.*;

class Exceptiondemo2X
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};
        int index = 0;

        try
        {

        System.out.println("Enter the index :");
        index = sobj.nextInt();


        System.out.println("element is :"+Arr[index]);

        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("inside the catch :"+aobj);
        }

        System.out.println("End of main");

    }
}