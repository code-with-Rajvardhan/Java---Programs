class Base
{
    
      int i ,j;

    void fun()        // 1000
    {
        System.out.println("inside base fun");
    }

     void gun()         // 2000
    {
         System.out.println("inside base gun");
    }

     void sun()     // 3000
    {
         System.out.println("inside base sun");
    }

     void run()         // 4000
    {
        System.out.println("inside base run");
    }
}                


class Derieved extends Base
{
   
        int x;

     void fun()      // 5000
    {
        System.out.println("inside derived fun");
    }

    void sun()         // 6000
    {
         System.out.println("inside derived sun");
    }

    void mun()      // 7000
    {
         System.out.println("inside derived mun");
    }

    void bun()         // 8000
    {
         System.out.println("inside derived bun");
    }             
}
class virtualdemo6
{
    public static void main(String A[]) 
    {
        
        Base bp = new Derieved();

        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
       // bp.mun();   // error
       // bp.bun();   // error

    }
}