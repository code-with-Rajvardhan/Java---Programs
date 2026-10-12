import java.util.Scanner;

class BillDiscount
{
    public double Discount(float bill)
    {
        double finalBill = 0;
        if(bill > 5000)
        {
            finalBill = bill - (bill * 0.20);
        }
        else if(bill > 3000)
        {
            finalBill = bill - (bill * 0.10);
        }
        else
        {
            finalBill = bill;
        }
        return finalBill;
    }
}

class bill 
{
    public static void main(String A[])  
    {
        Scanner scanner = null;
        scanner = new Scanner(System.in);

        BillDiscount billDiscount = null;
        
         

        float fBill = 0; 
        double dDiscout = 0;

        System.out.println("Enter your Bill Amount :");
        fBill = scanner.nextFloat();

        billDiscount = new BillDiscount();
        dDiscout = billDiscount.Discount(fBill);

        System.out.println("Final Bill is : " +dDiscout);
    }
}