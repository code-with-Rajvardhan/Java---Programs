class Arithmetic
{
    public int no1;
    public int no2;

    public Arithmetic()
    {
        this.no1 = 0;
        this.no2 = 0;
    }

    public Arithmetic(int i , int j)
    {
        this.no1 = i;
        this.no2 = j;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.no1 + this.no2;
        return Ans;
    }

    public int Substraction()
    {
        int Ans = 0;
        Ans = this.no1 - this.no2;
        return Ans;
    }
}

class oopxx
{
    public static void main(String A[])
    {
        Arithmetic aobj1 = new Arithmetic(21,10);

        int Result = 0;

        Result = aobj1.Addition();
        System.out.println("Addition is :" +Result);

        Result = aobj1.Substraction();
        System.out.println("subtraction is :" +Result);
    }
}