import java.util.Scanner;
class A
{
A()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter ID:");
int ID=sc.nextInt();
System.out.println("Enter Name:");
String name=sc.next();
System.out.println("Enter Age:");
int Age=sc.nextInt();
System.out.println("Enter Salary:");
int Salary=sc.nextInt();
System.out.println("Enter Designation:");
String Designation=sc.next();
System.out.println("ID:"+ID);
System.out.println("Name:"+name);
System.out.println("Age:"+Age);
System.out.println("Salary:"+Salary);
System.out.println("Designation:"+Designation);
}
}
class Demo2
{
public static void main(String args[])
{
A a=new A();
}
}