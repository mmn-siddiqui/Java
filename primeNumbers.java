import java.util.*;
public class primeNumbers
{
public static void main(String [] args)
{
int i=0;
int num =0;
String primeNumbers = "";

for (i=1; i<=100; i++)
{
int counter=0;
for (num=1; num>1; num--)
{
	if (i%num==0)
{
counter = counter + 1;
}
}
if (counter==2)
{
primeNumbers = primeNumbers + i + "";
}
 }
System.out.println("prime  number are: ");
System.out.println(primeNumbers);
}
}