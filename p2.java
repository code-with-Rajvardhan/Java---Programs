public class Bedroom
{
    public int i = 23;
    public int j = 45;
    public int k = 18;

    public void masterbedroom()
    {
        System.out.println("king size bed with big area");
    }
}

class p2
{
    public static void main(String A[])
    {
        Bedroom bobj = new Bedroom();

        bobj.masterbedroom();

        System.out.println(bobj.i);
        System.out.println(bobj.j);
        System.out.println(bobj.k);


    }
}