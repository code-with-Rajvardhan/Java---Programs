class Demo implements Runnable
{
    public void run()
    {
        try{
            int i = 0;
            
            
            for(i = 1; i<=5; i++)
                {
                    System.out.println("Thread is runing..."+Thread.currentThread().getName()+" "+i); 
                    Thread.sleep(1500);
                }
                
            }
            catch(Exception eobj)
            {

            }
    }
}

class Threaddemopractice1
{
    public static void main(String A[]) throws Exception
    {
       System.out.println("Inside the main thread"); 

       Thread dobj1 = new Thread(new Demo());
       Thread dobj2 = new Thread(new Demo());

       dobj1.setName("Thread1");
       dobj2.setName("Thread2");

       dobj1.start();
       dobj2.start();

       dobj1.join();
       dobj2.join();

       System.out.println("End of the main.");
    }
}