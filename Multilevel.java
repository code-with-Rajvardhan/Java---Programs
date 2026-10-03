 class Base
{
    public int i , j;

    public Base()
    {
        System.out.println("inside the construct\n");
    }

    public void fun()
    {
        System.out.println("inside the fun\n");
    }

    public void gun()
    {
        System.out.println("inside the gun\n");
    }
}

    class BaseA extends Base
  {
      public int x , y;

        public BaseA()
        {
            System.out.println("inside the contruct\n");
        }

        public void run()
        {
            System.out.println("inside the run\n");
        }
 } 

     class BaseB extends BaseA 
        {
            public int a;
             
            public BaseB()
            {
                System.out.println("inside the construct\n");
            }

            public void sun()
            {
                System.out.println("inside the sun\n");
            }
        }


public class Multilevel
{
    public static void main(String A[])
    {
        BaseB bobj = new BaseB();

        bobj.fun();
        bobj.gun();
        bobj.run();
        bobj.sun();
    }
}