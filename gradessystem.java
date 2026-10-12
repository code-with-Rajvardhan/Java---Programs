import java.util.Scanner;
class Grades
{
    public char percentage(float Marks) 
    {
        if(Marks >= 90)
        {
            return 'A';
        }
        else if(Marks >= 80)
        {
            return 'B';
        }
        else if(Marks >= 70)
        {
            return 'C';
        }
        else
        {
            return 'D'; 
        }
    }
}

class gradessystem
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();

        float fMarks = 0;
        char cResult = ' ';
        
        System.out.println("Enter Your Marks :");
        fMarks = scanner.nextFloat();

       
        cResult = grades.percentage(fMarks);

        System.out.println("Your Grade is : " + cResult);
    }
}