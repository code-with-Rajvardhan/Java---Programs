import java.util.*;
class ifelseladder
{
    public static void main(String A[] )
    {
       int std = 0;
       
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Enter your standerd :");

       std = sobj.nextInt();

       if (std == 1)
       {
            System.out.println("exam time is 9 am"); 
       }
      else if (std == 2)
       {
            System.out.println("exam time is 10 am"); 
       }
      else if (std == 3)
       {
            System.out.println("exam time is 11 am"); 
       }
       else
       {
        System.out.println("its invalid");
       }
    }
}