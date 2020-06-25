import java.util.*;
class PersonalInfo
{
public String name;
public int contact;
public String address1;


PersonalInfo()
{

Scanner in=new Scanner(System.in);

System.out.println("Enter address:");
address1=in.nextLine();

System.out.println("Enter name:");
name=in.nextLine();
System.out.println("Enter contact:");
contact=in.nextInt();




}

public void displayInfo()
{
System.out.println("NAME:"+name);
System.out.println("CONTACT:"+contact);
System.out.println("ADDRESS:"+address1);
}
public static void main(String[] args)
{
PersonalInfo obj=new PersonalInfo();
obj.displayInfo();
}

}