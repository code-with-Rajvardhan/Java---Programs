import java.util.*;
class practice
{
    public static void main(String A[])
    {
        int std = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the random number :");
        std = sobj.nextInt();

       switch (std) {
        case 1:
                System.out.println("no 1");
            break;
        case 2:
                System.out.println("no 2");
            break;
        case 3:
                System.out.println("no 3");
            break;
       
        default:
                System.out.println("out of number");
            break;
       }

    }
}