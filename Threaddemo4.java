class Demo implements Runnable
{
    public void run()
    {
        System.out.println("thread is running....");
    }
}

class Threaddemo4
{
    public static void main(String A[]) 
    {
        System.out.println("Inside main thread");

        Thread dobj1 = new Thread(new Demo());
        Thread dobj2 = new Thread(new Demo());

        dobj1.start();
        dobj2.start();   



    }
}