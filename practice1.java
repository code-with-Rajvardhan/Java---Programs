  class main
{
    public int i , j;

    public main()
    {
        System.out.println("inside main");
    }
   public  void happy()
    {
        System.out.println("inside happy");
    }
   public  void sad()
    {
        System.out.println("inside sad");
    }
    
}
class abc extends main
{
    int a;

   public  abc()
    {
        System.out.println("inside abc");
    }
   public  void moment()
    {
        System.out.println("inside abc moments");
    }

}

public class practice1
{
    public static void main(String A[])
    {
        abc aobj = new abc();

        aobj.happy();
        aobj.sad();
        aobj.moment();
    }
}