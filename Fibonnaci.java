import java.util.Scanner;

public class Fibonnaci{
public static void main(String []args);
{

    int nextterm = 0,t1 = 0,t2;
    for (int i=0;i<=10;i++)
    {
     System.out.println(""+nextterm);
     nextterm = t1 + t2;
     t1=t2;
     t2 = nextterm;


}
}
