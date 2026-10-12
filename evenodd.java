import java.util.Scanner;

class Cheaks
{
    public  String Cheakeven(int bill)
    {
        if ((bill % 2)== 0) 
        {
            return "even";
        }
        else
        {
            return "odd";
        }
    }
}

public class evenodd 
{
    public static void main(String A[]) 
    {
        Scanner scanner = null;
        scanner = new Scanner(System.in);

        int ibill = 0;
        String sName ;

        System.out.println("Enter your bill Amount :");
        ibill = scanner.nextInt();

        Cheaks cheaks = null;
        cheaks = new Cheaks();

        sName = cheaks.Cheakeven(ibill);

        System.out.println("your bill is :"+sName);
     
    }
    
} 
