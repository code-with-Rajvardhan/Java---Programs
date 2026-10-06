class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is runing..."+Thread.currentThread().getName());
        
    }
}

class Threaddemopractice
{
    public static void main(String A[]) throws Exception
    {
       System.out.println("Inside the main thread"); 

       Thread dobj1 = new Thread(new Demo());
       Thread dobj2 = new Thread(new Demo());

       dobj1.start();
       dobj2.start();

       dobj1.join();
       dobj2.join();

       System.out.println("End of the main.");
    }
}