public class Student
{
    public int id = 241;
    public String name;

    public void room()
    {
        System.out.println("rajvardhan 241");
    }

}
    

public class School
{
    public static void main(String A[])
    {
        Student s1 = new Student();

        s1.room();
        System.out.println(s1.id);
        System.out.println(s1.name);
        
    }
}