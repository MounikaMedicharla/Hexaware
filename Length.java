import java.util.Scanner;
class Length
{
public static void main(String args[])
{
int i=0;
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
str=sc.nextLine();
char ch[]=str.toCharArray();
for(char c:ch)
{
i++;
}
System.out.println("length of string:"+i);
}
}

