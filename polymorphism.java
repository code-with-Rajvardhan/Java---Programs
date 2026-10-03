class demo
{
    public int a , b , c;
    public float e , d;

    public void addition(int a , int b)
    {
       System.out.println("add of a and b\n"); 
    }

    public void addition(int a , int b , int c)
    {
       System.out.println("add of a and b and c\n"); 
    }

    public void addition(float e , float d)
    {
     System.out.println("add of e and d\n"); 
    }


}

public class polymorphism
{
    public static void main(String A[] )
    {  
        demo obj = new demo();

        obj.addition(11,12);
        obj.addition(20,10);
        obj.addition(10,34,33);

    }
}
